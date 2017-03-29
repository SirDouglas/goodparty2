package br.com.tiago.party.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class TesteController {
	
	
	
  @Inject
 private Result result;

	@Path("/teste")
	public void teste() {
		result.include("mensagem","Estou usando velocity");
	
			}
}
