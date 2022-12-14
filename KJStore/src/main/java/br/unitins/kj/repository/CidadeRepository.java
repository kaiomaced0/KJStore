package br.unitins.kj.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;

import br.unitins.kj.model.Cidade;

@ApplicationScoped
public class CidadeRepository extends Repository<Cidade>{
	
	public Cidade buscarPeloId(Integer id) {
		return getEntityManager().find(Cidade.class, id);
	}
	
	public List<Cidade> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT c FROM Cidade c ORDER BY c.nome");
		return query.getResultList();
	}

}
