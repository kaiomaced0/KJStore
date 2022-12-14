package br.unitins.kj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;


@Entity
public class Pagamento extends DefaultEntity{

	private TipoPagamento tipoPagamento;
	
	@ManyToOne
	private Usuario usuario;

	@OneToOne
	private Compra compra;
	
	@ManyToOne
	private Cartao cartao;
	
	@NotBlank
	@Column(name="valor_pagamento")
	private Double valorPagamento;
	
	@Column(name="pagamento_realizado")
	private Boolean pagamentoRealizado;
	
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public Boolean getPagamentoRealizado() {
		return pagamentoRealizado;
	}

	public void setPagamentoRealizado(Boolean pagamentoRealizado) {
		this.pagamentoRealizado = pagamentoRealizado;
	}
}
