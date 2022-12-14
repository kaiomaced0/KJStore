package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.kj.model.Compra;
import br.unitins.kj.repository.CompraRepository;

@Named
@ViewScoped
public class AdmPedidosController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7080243630355018767L;

	CompraRepository comprarepo;
	List<Compra> listaCompras;
	Compra compra;
	
	public void visualizar(Compra compra) {
		
	}
	
	public void enviar(Compra compra) {
		
	}
}
