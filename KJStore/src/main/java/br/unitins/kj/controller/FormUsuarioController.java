package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.application.Util;
import br.unitins.kj.model.Cidade;
import br.unitins.kj.model.Perfil;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.CidadeRepository;
import br.unitins.kj.repository.UsuarioRepository;

@Named
@ViewScoped
public class FormUsuarioController implements Serializable {
	
	private static final long serialVersionUID = -4197665569375141413L;
	private Usuario usuario = null;
	private List<Cidade> listaCidade;
	
	public FormUsuarioController() {
		// obtendo um usuario do flash scoped
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		// metodo que nao deixa apagar o objeto enquanto nao alterar a url
		flash.keep("flashUsuario");
		setUsuario((Usuario)flash.get("flashUsuario"));
	}
	
	public List<Cidade> getListaCidade() {
		if (listaCidade == null) { 
			CidadeRepository repo = new CidadeRepository();
			listaCidade = repo.buscarTodos();
		}
		return listaCidade;
	}
	
	public Perfil[] getListaPerfil() {
		return Perfil.values();
	}
	
	public String salvar() {
		UsuarioRepository repo = new UsuarioRepository();
		try {
			repo.salvar(getUsuario());
		} catch (Exception e) {
			Util.addErrorMessage(e.getMessage());
			e.printStackTrace();
			return null;
		}
		// PARA HABILITAR O ENVIO DE MENSAGEM ENTRE TELAS DIFERENTES
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		flash.setKeepMessages(true);
		
		Util.addInfoMessage("Usuario salvo com sucesso.");
		
		// o cancelar retorna para a pagina anterior
		return cancelar();
	}
	
	public String cancelar() {
		return "usuarios.xhtml?faces-redirect=true";
	}
	
	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();

		usuario.setSenha(Util.hash(usuario.getSenha()));
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
