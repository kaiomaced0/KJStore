package br.unitins.kj.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.unitins.kj.application.RepositoryException;
import br.unitins.kj.model.Usuario;

@ApplicationScoped
public class UsuarioRepository extends Repository<Usuario>{
	
	
	public Usuario buscarPeloId(Integer id) {
		return getEntityManager().find(Usuario.class, id);
	}
	
	public List<Usuario> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT u FROM Usuario u ORDER BY u.nome");
		return query.getResultList();
	}

	public Usuario buscar(String login, String senha) throws RepositoryException {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT "); 
		jpql.append("  u ");
		jpql.append("FROM ");
		jpql.append("  Usuario u ");
		jpql.append("WHERE ");
		jpql.append("  u.login = :pLogin AND ");
		jpql.append("  u.senha = :pSenha ");
		
		Query query = getEntityManager().createQuery(jpql.toString());
		query.setParameter("pLogin", login);
		query.setParameter("pSenha", senha);
		
		try {
			
			return (Usuario)query.getSingleResult();
		} catch (NoResultException e) {
			throw new RepositoryException("Login ou senha Invalido");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
