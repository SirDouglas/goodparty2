package br.com.tiago.party.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tiago.party.modelo.Materia;

@RequestScoped
public class MateriaDao {

	@Inject
	private EntityManager manager;
	
	public void insere(Materia materia) {
		manager.persist(materia);
		
	}
	
	public void altera(Materia materia)   {
		manager.merge(materia);
	}
	
	public void remove(Materia materia) {
		manager.remove(materia);
	}
	
	public List<Materia> lista() {
		return manager.createQuery("select m from Materia m").getResultList();
		
	}
	
	public Materia mostra(Materia materia) {
		
		return manager.find(Materia.class,materia.getId());
		
	}
	
}
