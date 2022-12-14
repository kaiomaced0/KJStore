package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.unitins.kj.application.Session;
import br.unitins.kj.application.Util;
import br.unitins.kj.model.AcompanhamentoCompra;
import br.unitins.kj.model.BandeiraCartao;
import br.unitins.kj.model.Compra;
import br.unitins.kj.model.Pagamento;
import br.unitins.kj.model.ProdutoQuantidade;
import br.unitins.kj.model.TipoPagamento;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.CompraRepository;
import br.unitins.kj.repository.PagamentoRepository;

@ViewScoped
@Named
public class FinalizarCompraController implements Serializable{

	
	
	private static final long serialVersionUID = -357236187444858111L;

	private Compra compra;
	
	private Pagamento pagamento;
	
	@Inject
	private CompraRepository compraRepository;
	private PagamentoRepository pagamentoRepository;
	
	private List<BandeiraCartao> listaBandeiraCartao;
	
	public List<ProdutoQuantidade> getItensCompra() {
		Session session = Session.getInstance();
		
		compra = (Compra) session.get("compra");
		
		if (compra == null)
			return new ArrayList<ProdutoQuantidade>();
		
		return compra.getCarrinho().getProdutos();
	}
	
	public TipoPagamento[] getListaTipoPagamento() {
		return TipoPagamento.values();
	}
	
	public void finalizarCompra() {
	 try {
		Usuario usuario = (Usuario) Session.getInstance().get("usuarioLogado");
		
		// validando o usuario
		if (usuario == null) {
			Util.addErrorMessage("Faça o login antes de finalizar a compra");
			return;
		}
		
		if(compra.getCarrinho().getProdutos().size() == 0) {
			Util.addErrorMessage("Compra vazia");
			return;
		}
		// validando a bandeira do cartao
		if (getPagamento().getTipoPagamento().equals(TipoPagamento.CREDITO) || 
				getPagamento().getTipoPagamento().equals(TipoPagamento.DEBITO) ) {
			
		}
		
		compra.setUsuario(usuario);
		compra.setPagamento(getPagamento());
		
		try {
			compraRepository.salvar(compra);
			pagamentoRepository.salvar(pagamento);
			compra.getCarrinho().setCompra_realizada(true);
			AcompanhamentoCompra acompanhamentoCompra = null;
			compra.setAcompanhamentoCompra(acompanhamentoCompra);
			Util.addInfoMessage("Compra realizada com sucesso.");
		} catch (Exception e) {
			Util.redirect("finalizarCompra.xhtml");
			Util.addErrorMessage(e.getMessage());
		}
	 }catch (Exception e) {
		 Util.redirect("finalizarCompra.xhtml");
			Util.addErrorMessage(e.getMessage());
	}
	}

	public Pagamento getPagamento() {
		if (pagamento == null)
			pagamento = new Pagamento();
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public List<BandeiraCartao> getListaBandeiraCartao() {
		return listaBandeiraCartao;
	}

	public void setListaBandeiraCartao(List<BandeiraCartao> listaBandeiraCartao) {
		this.listaBandeiraCartao = listaBandeiraCartao;
	}
	
	

}
