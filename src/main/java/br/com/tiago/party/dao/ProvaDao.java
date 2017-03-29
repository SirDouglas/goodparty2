package br.com.tiago.party.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tiago.party.modelo.Prova;

@RequestScoped
public class ProvaDao {

	@Inject
	private EntityManager manager;
	
	public void insere(Prova prova) {
		manager.persist(prova);
	}
	
	public void altera(Prova prova) {
		manager.merge(prova);
	}
	
	public void remove(Prova prova) {
		manager.remove(prova);
	}
	
	public List<Prova> lista() {
		return manager.createQuery("select p FROM Prova p").getResultList();
		
	}
	
	public Prova mostra(Prova prova) {
		return manager.find(Prova.class, prova.getId());
		
	}
}
