package br.unitins.kj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao extends DefaultEntity{
	
	@ManyToOne
	private Usuario usuario;
	
	@NotBlank
	@Column(name="Nome_cartao")
	private String nome;
	@NotBlank
	private String numero_cartao;
	
	private Integer cvv;
	
	private String validade;
	
	@NotBlank
	@Column(name="Bandeira_Cartão")
	private BandeiraCartao bandeiraCartao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero_cartao() {
		return numero_cartao;
	}
	public void setNumero_cartao(String numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public BandeiraCartao getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(BandeiraCartao bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	
	

}
