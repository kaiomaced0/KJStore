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
//import br.unitins.kj.repository.UsuarioRepositoryRepository;


@Named
@ViewScoped
public class EstadoController implements Serializable {

	private static final long serialVersionUID = 940590651764702687L;
	private List<UsuarioRepository> listaUsuarioRepository;
	
//	public List<UsuarioRepository> getListaUsuarioRepository() {
//		if (listaUsuarioRepository == null) {
//			UsuarioRepository repo = new UsuarioRepository();
//			listaUsuarioRepository = repo.buscarTodos();
//			if (listaUsuarioRepository == null)
//				listaUsuarioRepository = new ArrayList<UsuarioRepository>();
//		}
//		return listaUsuarioRepository;
//	}
	
	public String editar(Usuario usuario) {
		// flash scoped
		Flash flash = FacesContext.
						getCurrentInstance().
						getExternalContext().getFlash();
		
		flash.put("flashUsuarioRepository", usuario);
		
		return "formusuario.xhtml?faces-redirect=true";
	}
	
	public void excluir(Usuario usuario) {
		
	}

	public List<UsuarioRepository> getListaUsuarioRepository() {
		return listaUsuarioRepository;
	}

	public void setListaUsuarioRepository(List<UsuarioRepository> listaUsuarioRepository) {
		this.listaUsuarioRepository = listaUsuarioRepository;
	}
	
	

}
