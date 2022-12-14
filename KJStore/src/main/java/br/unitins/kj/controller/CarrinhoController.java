package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.application.Session;
import br.unitins.kj.application.Util;
import br.unitins.kj.model.Carrinho;
import br.unitins.kj.model.Compra;
import br.unitins.kj.model.ProdutoQuantidade;
import br.unitins.kj.repository.CompraRepository;
@ViewScoped
@Named
public class CarrinhoController implements Serializable{

	
	private static final long serialVersionUID = 2997702547622264432L;
	
	private Carrinho carrinho;
	
	
	public List<ProdutoQuantidade> getProdutosCarrinho() {
		Session session = Session.getInstance();
		
		carrinho = (Carrinho) session.get("carrinho");
		
		if (carrinho == null) {
			Carrinho carrinho = new Carrinho();
			return carrinho.getProdutos();
		}
		return carrinho.getProdutos();
	}
	
	public void finalizarCompra() {
		// verificando se o usuario esta logado
		if (Session.getInstance().get("usuarioLogado") == null) 
			Util.redirect("login.xhtml");
		
		Carrinho carrinho = (Carrinho) Session.getInstance().get("carrinho");
		
		if (carrinho == null || 
				carrinho.getValorTotal() == null ||
					carrinho.getProdutos().isEmpty()) {
			Util.addWarnMessage("Adicione um item no carrinho antes de concluir a carrinho.");
			return;
		}
		
		
		Util.redirect("finalizarCompra.xhtml");
		
	}
}
