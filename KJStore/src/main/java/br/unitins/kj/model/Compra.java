package br.unitins.kj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Compra extends DefaultEntity {
	
	@NotBlank
	@Column(name="carrinho_compra")
	private Carrinho carrinho;
	
	@NotBlank
	@OneToOne
	private Pagamento pagamento;
	
	@OneToOne
	private AcompanhamentoCompra acompanhamentoCompra;
	
	private Boolean pagamentoRealizado;
	
	@ManyToOne
	private Usuario usuario;

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public AcompanhamentoCompra getAcompanhamentoCompra() {
		return acompanhamentoCompra;
	}

	public void setAcompanhamentoCompra(AcompanhamentoCompra acompanhamentoCompra) {
		this.acompanhamentoCompra = acompanhamentoCompra;
	}

	public Boolean getPagamentoRealizado() {
		return pagamentoRealizado;
	}

	public void setPagamentoRealizado(Boolean pagamentoRealizado) {
		this.pagamentoRealizado = pagamentoRealizado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
