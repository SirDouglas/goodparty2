package br.com.tiago.party.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Classe {

	
	@GeneratedValue
	@Id
	private Long id;
	
	
	@NotNull
	private String nomeClasse;
	
	@NotNull
	private String categoriaClasse;
	
	@NotNull
	private String horarioClasse;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	public String getCategoriaClasse() {
		return categoriaClasse;
	}
	public void setCategoriaClasse(String categoriaClasse) {
		this.categoriaClasse = categoriaClasse;
	}
	public String getHorarioClasse() {
		return horarioClasse;
	}
	public void setHorarioClasse(String horarioClasse) {
		this.horarioClasse = horarioClasse;
	}
	
}
