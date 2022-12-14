package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Compra;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.CompraRepository;

@Named
@ViewScoped
public class ComprasController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1145462872767754684L;

	List<Compra> listaCompras;
	Usuario usuarioLogado;
	

	public List<Compra> getListaCompras() {
		if (listaCompras == null) { 
			CompraRepository repo = new CompraRepository();
			listaCompras = repo.buscarTodos();
		}
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	
	
}
