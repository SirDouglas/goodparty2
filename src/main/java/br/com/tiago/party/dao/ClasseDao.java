package br.com.tiago.party.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tiago.party.modelo.Classe;

@RequestScoped
public class ClasseDao {

	@Inject
	private EntityManager manager;
	
	
	public void insere(Classe classe) {
		manager.persist(classe);
	}
	public void altera(Classe classe) {
		manager.merge(classe);
	}
	public void remove(Classe classe) {
		manager.remove(classe);
	}
	
	public List<Classe> lista() {
		return manager.createQuery("select c FROM Classe c").getResultList();
		
	}
	
	public Classe mostra(Classe classe) {
		return manager.find(Classe.class, classe.getId());
	}
}
