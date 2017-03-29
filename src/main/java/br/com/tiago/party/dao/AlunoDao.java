package br.com.tiago.party.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tiago.party.modelo.Aluno;

@RequestScoped
public class AlunoDao {

	
	@Inject
	private EntityManager manager;
	
	
	public void insere(Aluno aluno) {
		manager.persist(aluno);
		
	}
	
	public void altera(Aluno aluno) {
		manager.merge(aluno);
	}
	
	public void remove(Aluno aluno) {
		manager.remove(aluno);
	}
	
	public List<Aluno> lista() {
		return manager.createQuery("select a FROM Aluno a").getResultList();
		
	}
	
	public Aluno mostra(Aluno aluno) {
		return manager.find(Aluno.class, aluno.getId());
		
	}

	public List<Aluno> busca(String nome) {
		// TODO Auto-generated method stub
		return manager.createQuery("select a FROM Aluno a where nomeAluno  like :nomeAluno").setParameter("nomeAluno","%" + nome + "%").getResultList();
	}
}
