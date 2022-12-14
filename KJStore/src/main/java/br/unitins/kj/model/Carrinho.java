package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.unitins.kj.model.especial.Cupom;


@Entity
public class Carrinho extends DefaultEntity{
	
	private List<ProdutoQuantidade> produtos;
	private Double valorSelecionado;
	private Double valorTotal ;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToMany
	@Column(name="cupons")
	private List<Cupom> cupons;
	
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	@Column(name = "valor_frete")
	private double valorFrete;
	
	@Column(name="compra_realizada")
	private Boolean compra_realizada;

	public Double getValorSelecionado() {
		return valorSelecionado;
	}

	public void setValorSelecionado(Double valorSelecionado) {
		this.valorSelecionado = valorSelecionado;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ProdutoQuantidade> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoQuantidade> produtos) {
		this.produtos = produtos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cupom> getCupons() {
		return cupons;
	}

	public void setCupons(List<Cupom> cupons) {
		this.cupons = cupons;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Boolean getCompra_realizada() {
		return compra_realizada;
	}

	public void setCompra_realizada(Boolean compra_realizada) {
		this.compra_realizada = compra_realizada;
	}
	
	
	

}
