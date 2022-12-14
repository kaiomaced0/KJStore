package br.unitins.kj.model.especial;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.unitins.kj.model.DefaultEntity;
import br.unitins.kj.model.Produto;
import br.unitins.kj.model.Usuario;

@Entity
public class Gostei extends DefaultEntity {
	
	private List<Produto> produtos;
	
	@OneToOne
	private Usuario usuario;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
