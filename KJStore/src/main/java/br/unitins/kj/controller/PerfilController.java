package br.unitins.kj.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.application.Util;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class PerfilController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3433791273122048806L;

	UsuarioRepository usuarioLogado;
	Usuario usuario;
	
	
	public void visualizarCompras() {
		Util.redirect("compras.xhtml");
	}
	public void visualizarEnderecos() {
		Util.redirect("formLocal.xhtml");
	}
	public void visualizarCartoes() {
		Util.redirect("formCartao.xhtml");
	}
	public void visualizarGostei() {
		Util.redirect("amei.xhtml");
	}
}
