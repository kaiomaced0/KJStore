package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.ProdutoQuantidade;
import br.unitins.kj.repository.CompraRepository;
import br.unitins.kj.repository.ProdutoRepository;

@Named
@ViewScoped
public class InfoCompraController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5370620756271410369L;

	CompraRepository compra;
	ProdutoRepository produtorepo;
	List<ProdutoQuantidade> listaProdutos;
}
