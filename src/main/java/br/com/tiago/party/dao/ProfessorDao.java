package br.com.tiago.party.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tiago.party.modelo.Professor;

@RequestScoped
public class ProfessorDao {

	@Inject
	private EntityManager manager;
	
	public void adiciona(Professor professor) {
		manager.persist(professor);
	}
	
	public void altera(Professor professor) {
		manager.merge(professor);
	}
	
	public void remove(Professor professor) {
		manager.remove(professor);
	}
	
	public List<Professor> lista() {
		return manager.createQuery("select p FROM Professor p").getResultList();
		
	}
	
	public Professor mostra(Professor professor) {
		return manager.find(Professor.class,professor.getId());
	}
	
	
	
}
