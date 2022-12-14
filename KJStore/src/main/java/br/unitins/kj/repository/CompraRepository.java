package br.unitins.kj.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;

import br.unitins.kj.model.Compra;

@ApplicationScoped
public class CompraRepository extends Repository<Compra>{
	
	public List<Compra> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT c FROM Compra c ORDER BY c.nome");
		try {
		return query.getResultList();
		}
		catch (Exception e) {
			return query.getResultList();
		}	
	}
	
}
