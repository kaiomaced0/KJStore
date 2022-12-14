package br.unitins.kj.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.application.Util;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class CadastroUsuarioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 197911204100752678L;

	Usuario usuario;

	public void cadastrar() {
		UsuarioRepository repo = new UsuarioRepository();
		try {
			usuario.setSenha(usuario.getSenha());
			repo.salvar(usuario);
			Util.redirect("login.xhtml");
			Util.addInfoMessage("Usuario " + usuario.getNome() + "  salvo com sucesso! ");
		} catch (Exception e) {
			Util.addErrorMessage(e.getMessage() + " - Cadastro não realizado");
			e.printStackTrace();
			return;
		}

	}
}
