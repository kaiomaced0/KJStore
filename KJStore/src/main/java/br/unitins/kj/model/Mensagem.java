package br.unitins.kj.model;

import javax.persistence.Column;
import javax.persistence.OneToMany;

public class Mensagem {
	
	
	public Mensagem(String mensagem, Usuario usuario) {
		super();
		this.mensagem = mensagem;
		this.usuario = usuario;
	}
	private String mensagem;
	
	@OneToMany
	@Column(name="usuario_mensagem")
	private Usuario usuario;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "[Mensagem = " + getMensagem() + ", Usuario = " + getUsuario() + "]";
	}
	
	

	
}
