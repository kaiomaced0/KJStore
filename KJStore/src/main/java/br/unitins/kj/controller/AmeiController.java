package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Usuario;
import br.unitins.kj.model.especial.Gostei;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class AmeiController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3175116939600029308L;

	UsuarioRepository usuariorepo;
	Usuario usuarioLogado;
	List<Gostei> listaGostei;
	
	public UsuarioRepository getUsuariorepo() {
		return usuariorepo;
	}
	public void setUsuariorepo(UsuarioRepository usuariorepo) {
		this.usuariorepo = usuariorepo;
	}
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public List<Gostei> getListaGostei() {
		return listaGostei;
	}
	public void setListaGostei(List<Gostei> listaGostei) {
		this.listaGostei = listaGostei;
	}
	
	
	
}
