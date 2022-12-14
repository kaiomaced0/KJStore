package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cidade extends DefaultEntity{
	private String nome;
	
	@Column(name="lista_cep_cidade")
	private List<String> cep;
	
	@ManyToOne
	private Estado estado;
	
	@OneToMany
	@Column(name="lista_usuarios")
	private List<Usuario> listaUsuarios_cidade;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getCep() {
		return cep;
	}

	public void setCep(List<String> cep) {
		this.cep = cep;
	}

}
