package br.com.tiago.party.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Professor {

	
	@GeneratedValue
	@Id
	private Long id;
	
	@NotNull
	private String nomeProfessor;
	private String enderecoProfessor;
	private String telefoneProfessor;
	private String obs;
	private Calendar dataNascimento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getEnderecoProfessor() {
		return enderecoProfessor;
	}
	public void setEnderecoProfessor(String enderecoProfessor) {
		this.enderecoProfessor = enderecoProfessor;
	}
	public String getTelefoneProfessor() {
		return telefoneProfessor;
	}
	public void setTelefoneProfessor(String telefoneProfessor) {
		this.telefoneProfessor = telefoneProfessor;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
