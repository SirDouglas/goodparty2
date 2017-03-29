package br.com.tiago.party.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.tiago.party.dao.ClasseDao;
import br.com.tiago.party.modelo.Classe;

@Controller
public class ClasseController {

	
	@Inject
	private ClasseDao dao;
	
	@Inject
	private Result result;
	
	@Inject
	private Validator validator;
	
	
	@Get("/classe")
	public List<Classe> lista() {
		return dao.lista();
		
	}
	
	@Path("classe/nova")
	public void formulario() {
		
	}
	
	
	@Post("/classe")
	public void adiciona(@NotNull @Valid Classe classe) {
		validator.onErrorUsePageOf(this).formulario();
		dao.insere(classe);
		result.redirectTo(this).lista();
	}
	

	
	@Get("/classe/{id}")
	public Classe edita(Long id) {
	Classe classe = new Classe();
	classe.setId(id);
		return dao.mostra(classe);
		
	}
	
	@Put("classe/{classe.id}")
	public void altera(@NotNull @Valid  Classe classe) {
		validator.onErrorUsePageOf(this).edita(classe.getId());
		dao.altera(classe);
		result.redirectTo(this).lista();
	}
	
	@Delete("classe/{id}")
	public void remove(Long id) {
		Classe classe = new Classe();
		classe.setId(id);
		classe = dao.mostra(classe);
		dao.remove(classe);
		result.redirectTo(this).lista();
	}
	
	
}
