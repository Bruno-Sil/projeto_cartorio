package br.com.github.brunosil.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.github.brunosil.modelo.Tabeliao;

public class CriarTipoTabeliao {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tabeliao");
		EntityManager em = emf.createEntityManager();
		
		Tabeliao tabeliao = em.find(Tabeliao.class, 3L);
		
		em.getTransaction().begin();
		
		tabeliao.SetTipo("Tabelião de Protesto");
		
		em.getTransaction().commit();
		
	}

}
