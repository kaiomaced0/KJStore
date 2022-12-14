package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.BandeiraCartao;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class FormCartaoController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9211422438094332010L;

	UsuarioRepository usuariorepo;
	Usuario usuarioLogado;
	List<BandeiraCartao> listaBandeiras;
	
}
