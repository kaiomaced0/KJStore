package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Estado extends DefaultEntity{
	private String sigla;
	private String nome;
	
	@OneToMany
	@Column(name="cidades_Estado")
	private List<Cidade> cidadesEstado;	
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
