package br.com.github.brunosil.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarClasseTeste {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tabeliao");
		EntityManager em = emf.createEntityManager();
		emf.close();
	}

}
