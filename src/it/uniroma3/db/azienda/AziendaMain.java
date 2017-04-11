package it.uniroma3.db.azienda;
import java.util.*;

import javax.persistence.*;

public class AziendaMain {
	public static void main(String[]args){
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("azienda-unit");
	EntityManager em = emf.createEntityManager();
	
	List<Impiegato> listimpiegato1=new ArrayList<Impiegato>();
	List<Impiegato> listimpiegato2=new ArrayList<Impiegato>();
	Progetto progetto1=new Progetto("Elettricismochepassione", "22/02/2017", listimpiegato1);
	Progetto progetto2=new Progetto("Motociclismochepassione", "22/01/2017", listimpiegato2);
	Divisione div1=new Divisione("Nullafacenti", listimpiegato1);
	Divisione div2=new Divisione("Nullafacenti2", listimpiegato2);
	Impiegato i1=new Impiegato("Gino", "Peppo","elettricista", div1);
	Impiegato i2=new Impiegato("Pino", "Peppo","Motociclista", div2);
	listimpiegato1.add(i1);
	listimpiegato2.add(i2);
	
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(i1);
	em.persist(i2);
	em.persist(progetto1);
	em.persist(progetto2);
	em.persist(div1);
	em.persist(div2);
	tx.commit();
	em.close();
	emf.close();
	
	
}
}
