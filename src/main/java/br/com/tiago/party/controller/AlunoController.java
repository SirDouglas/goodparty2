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
import br.com.tiago.party.dao.AlunoDao;
import br.com.tiago.party.modelo.Aluno;
import static br.com.caelum.vraptor.view.Results.*;

@Controller
public class AlunoController {

	@Inject
	private Result result;
	
	@Inject
	private AlunoDao dao;
	
	
	@Inject
	private Validator validation;


	
    @Get("/aluno")
	public List<Aluno> lista() {
		return dao.lista();
		
	}
	
	@Get("/aluno/novo")
	public void cadastra() {
		
		
	}
	
	@Post("/aluno")
	public void adiciona(@NotNull @Valid Aluno aluno) {
		validation.onErrorForwardTo(this).cadastra();
		dao.insere(aluno);
		result.redirectTo(this).lista();
	}
	
	@Get("/aluno/{id}")
	public Aluno edita(Long id) {
				Aluno aluno = new Aluno();
		aluno.setId(id);
		return dao.mostra(aluno);
		
	}
	
	@Put("/aluno/{aluno.id}")
	public void altera(@NotNull @Valid Aluno aluno) {
		validation.onErrorForwardTo(this).edita(aluno.getId());
		dao.altera(aluno);
		result.redirectTo(this).lista();
	}
	
	@Delete("/aluno/{id}")
	public void remove(Long id) {
		Aluno aluno = new Aluno();
		aluno.setId(id);
        aluno = dao.mostra(aluno);
		aluno.setId(id);
		dao.remove(aluno);
		result.redirectTo(this).lista();
	}
	
	public List<Aluno> busca(String nome) {
		result.include("nome",nome);
		return dao.busca(nome);
		
	}
	  	@Get("/aluno/busca.json")
		public void buscaJson(String term) {
			result.use(json()).withoutRoot()
			.from(dao.busca(term))
			.excludeAll()
			.include("nomeAluno")
			.serialize();
		}
	
}
