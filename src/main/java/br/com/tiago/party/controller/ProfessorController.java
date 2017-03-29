package br.com.tiago.party.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.tiago.party.dao.ProfessorDao;
import br.com.tiago.party.modelo.Professor;

@Controller
public class ProfessorController {

	@Inject
	private Result result;
	
	@Inject
	private ProfessorDao dao;
	
	@Inject
	private Validator validator;
	
	@Get("/professor")
	public List<Professor> lista() {
		return dao.lista();
		
	}
	
	@Get("/professor/novo")
	public void cadastra() {
		
	}
	
	
	@Post("/professor")
	public void adiciona(@NotNull @Valid Professor professor) {
		validator.onErrorUsePageOf(this).cadastra();
	dao.adiciona(professor);
	result.redirectTo(this).lista();
	}
	
	
	@Get("/professor/{id}")
	public Professor mostra(Long id) {
		Professor professor = new Professor();
		professor.setId(id);
		return dao.mostra(professor);
		
	}
	
	@Put("/professor/{professor.id}")
	public void altera(@NotNull @Valid Professor professor) {
		validator.onErrorUsePageOf(this).mostra(professor.getId());
		dao.altera(professor);
		result.redirectTo(this).lista();
	}
	
	@Delete("/professor/{id}")
	public void remove(Long id){
		Professor professor = new Professor();
		professor.setId(id);
		professor = dao.mostra(professor);
		dao.remove(professor);
		result.redirectTo(this).lista();
	}
}
