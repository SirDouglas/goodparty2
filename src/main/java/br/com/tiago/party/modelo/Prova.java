package br.com.tiago.party.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prova {

	
	@GeneratedValue @Id
	private Long id;
	
	private String nomeProva;
	
	private String obs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
}
