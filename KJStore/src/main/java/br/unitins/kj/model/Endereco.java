package br.unitins.kj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Endereco extends DefaultEntity{
	@Column(name="nome_endereco")
	private String nome;
	@Column(name="cidade_endereco")
	private Cidade cidade;
	@Column(name="bairro_endereco")
	private String bairro;
	@Column(name="cep_endereco")
	private String cep;
	@Column(name="adicional")
	private String infoAdicional;

	@ManyToOne
	private Usuario usuario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	
	

}
