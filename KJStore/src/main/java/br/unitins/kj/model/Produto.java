package br.unitins.kj.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto extends DefaultEntity {

	@Column(name="nomeProduto")
	private String nome;
	
	@Column(name="valorProduto")
	private Double valor;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
