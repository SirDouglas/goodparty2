package br.com.tiago.party.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class MundoController {
	
	
	@Inject
	private Result result;
	
	public List<String> paises() {
	List<String> lista = new ArrayList<String>();
	lista.add("Brasil");
	lista.add("Argentina");
	lista.add("Holanda");
	lista.add("Japão");
	lista.add("EUA");
	
	return lista;		
	}
	
	public void mostra() {
		result.include("numero", 1.0);
	}

}
