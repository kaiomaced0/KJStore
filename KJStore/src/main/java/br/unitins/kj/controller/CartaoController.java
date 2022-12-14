package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Cartao;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class CartaoController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5251426885136542712L;

	Usuario usuarioLogado;
	UsuarioRepository usuariorepo;
	List<Cartao> listaCartoes;
	
	
}
