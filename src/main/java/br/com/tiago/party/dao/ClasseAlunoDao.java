package br.com.tiago.party.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tiago.party.modelo.ClasseAluno;

@RequestScoped
public class ClasseAlunoDao {
	
	@Inject
	private EntityManager manager;

	
	public void insere(ClasseAluno classeAluno) {
		manager.persist(classeAluno);
	}
	public void altera(ClasseAluno classeAluno) {
		manager.merge(classeAluno);
	}
	public void remove(ClasseAluno classeAluno) {
		manager.remove(classeAluno);
	}
	public List<ClasseAluno> lista() {
		return manager.createQuery("select c FROM classeAluno c").getResultList();
	}
	
	public ClasseAluno mostra(ClasseAluno classeAluno) {
		return manager.find(ClasseAluno.class, classeAluno.getId());
	}
}
