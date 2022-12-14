package br.unitins.kj.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.CidadeRepository;
import br.unitins.kj.repository.EstadoRepository;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class FormLocalController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -126392203432734302L;

	UsuarioRepository usuariorepo;
	Usuario usuarioLogado;
	CidadeRepository cidaderepo;
	EstadoRepository estadorepo;
	
	
}
