package br.com.github.brunosil.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.github.brunosil.modelo.Tabeliao;

public class CriarTabeliao {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tabeliao");
		EntityManager em = emf.createEntityManager();
		
		Tabeliao tabeliao = new Tabeliao();
		tabeliao.setNome("Bruno");
		tabeliao.setSexo("Masculino");
		tabeliao.setCpf("61212272307");
		
		em.getTransaction().begin();
		
		em.persist(tabeliao);
		
		em.getTransaction().commit();
	}

}
