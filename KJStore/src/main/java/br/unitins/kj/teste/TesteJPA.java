package br.unitins.kj.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unitins.kj.model.Usuario;


public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("KJStore");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setNome("test123");
		usuario.setLogin("123");
		usuario.setSenha("123");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		System.out.println("Fim");
	}
}
