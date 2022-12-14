package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class AdmUsuariosController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1695762954326513449L;
	
	List<Usuario> listaUsuario;
	UsuarioRepository usuariorepo;

	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null) {
			UsuarioRepository repo = new UsuarioRepository();
			listaUsuario = repo.buscarTodos();
			if (listaUsuario == null)
				listaUsuario = new ArrayList<Usuario>();
		}
		return listaUsuario;
	}
	public String editar(Usuario usuario) {
		// flash scoped
		Flash flash = FacesContext.
						getCurrentInstance().
						getExternalContext().getFlash();
		
		flash.put("flashUsuario", usuario);
		
		return "formUsuario.xhtml?faces-redirect=true";
	}
	
	public void inativar(Usuario usuario) {
		
		
		
	}
}
