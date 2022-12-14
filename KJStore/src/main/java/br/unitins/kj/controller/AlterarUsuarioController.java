package br.unitins.kj.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class AlterarUsuarioController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8919955275702622935L;

	UsuarioRepository usuariorepo;
	Usuario usuarioLogado;
}
