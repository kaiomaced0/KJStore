package br.unitins.kj.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.CidadeRepository;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class LocaisController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 419119879166732712L;

	UsuarioRepository usuarioLogado;
	Usuario usuario;
	CidadeRepository cidade;
}
