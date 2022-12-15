package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.unitins.kj.application.Session;
import br.unitins.kj.application.Util;
import br.unitins.kj.model.Carrinho;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.ProdutoRepository;


@Named
@ViewScoped
public class TemplateController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2777611273447498474L;

	private String nomeProduto;
	
	@Inject
	private ProdutoRepository produtoRepository;
	
	public String pesquisarProduto() {
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		flash.put("pesquisaProduto", produtoRepository.buscarPeloNome(getNomeProduto()));
		return "home.xhtml?faces-redirect=true";
	}
	
	public Usuario getUsuarioLogado() {
		Map session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		return (Usuario) session.get("usuarioLogado");
	}
	
	public String encerrarSessao() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "login2.xhtml?faces-redirect=true";
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void home() {
		Util.redirect("home.xhtml");
	}
	
	public Integer getQuantidadeCarrinho() {
		Session session = Session.getInstance();
		Carrinho carrinho = (Carrinho) session.get("carrinho");
		Integer quantidade = null;
		if (carrinho == null || carrinho.getProdutos() == null)
			return quantidade;
		if(carrinho.getProdutos().size() > 0) {
			for (int i = 0; i < carrinho.getProdutos().size(); i++) {
				quantidade = quantidade + carrinho.getProdutos().get(i).getQuantidade();
			}
		}
		return quantidade;
		
	}
	
	

}
