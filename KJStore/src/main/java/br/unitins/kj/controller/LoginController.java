package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.unitins.kj.application.RepositoryException;
import br.unitins.kj.application.Util;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@RequestScoped
public class LoginController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9013820690394591629L;
	private Usuario usuario;
	
	public String logar() {
		
		UsuarioRepository repo = new UsuarioRepository();
		
		Usuario usuarioLogado = null;
		if(usuario.getLogin() == "adm123") {
			try {
				usuarioLogado = repo.buscar(getUsuario().getLogin(), getUsuario().getSenha());
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
		try {
			if(usuario != null)
				usuario.setSenha(Util.hash(usuario.getSenha()));
			usuarioLogado = repo.buscar(getUsuario().getLogin(), getUsuario().getSenha());
		} catch (RepositoryException e) {
			// quando entrar nesse exception, significa que o usuario nao foi encontrado
			e.printStackTrace();
			Util.addErrorMessage("Usuario não encontrado!");
			return "login.xhtml?faces-redirect=true";
			
		}
		}
		Map session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session.put("usuarioLogado", usuarioLogado);
		
		return "home.xhtml?faces-redirect=true";
	}
	public void cadastro() {
		Util.redirect("cadastroUsuario.xhtml");
	}
	

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

}
