package br.com.tiago.party.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.tiago.party.dao.MateriaDao;
import br.com.tiago.party.modelo.Materia;

@Controller
public class MateriaController {

	
	
	@Inject
	private MateriaDao dao;
	
	@Inject
	private Result result;
	
	@Inject
	private Validator validation;
	
	
	@Get("/materia/nova")
	public void formulario() {
		
	}
	
	@Get("/materia")
	public List<Materia> lista() {
		return dao.lista();
		
	}
	
	
	@Post("/materia")
	public void insere(@NotNull @Valid Materia materia) {
		validation.onErrorUsePageOf(this).formulario();
		dao.insere(materia);
		result.redirectTo(this).lista();
	}
	
	@Get("/materia/{id}")
	public Materia mostra(Long id) {
		Materia materia = new Materia();
		materia.setId(id);
		return dao.mostra(materia);
		
	}
	
	@Delete("/materia/{id}")
	public void remove(Long id) {
		Materia materia = new Materia();
		materia.setId(id);
		materia = dao.mostra(materia);
		dao.remove(materia);
		result.redirectTo(this).lista();
	}
	
	@Put("materia/{materia.id}")
	public void altera(@NotNull  @Valid Materia materia) {
		validation.onErrorUsePageOf(this).mostra(materia.getId());
		dao.altera(materia);
		result.redirectTo(this).lista();
	}
	
	
	
	
}
