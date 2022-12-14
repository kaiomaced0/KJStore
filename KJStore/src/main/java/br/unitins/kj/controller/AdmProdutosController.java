package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Produto;
import br.unitins.kj.repository.ProdutoRepository;

@Named
@ViewScoped
public class AdmProdutosController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5047722682673778049L;

	List<Produto> listaProdutos;
	ProdutoRepository produtorepo;
	Produto produto;
	
	public void alterar(Produto produto){
		
	}
	
	public void inativar(Produto produto) {
		
	}
}
