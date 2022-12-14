package br.unitins.kj.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ProdutoQuantidade extends DefaultEntity{
	
	@ManyToOne
	private Produto produto;
	
	private Integer quantidade;
	private Double valor = produto.getValor() * quantidade;
	
	

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
