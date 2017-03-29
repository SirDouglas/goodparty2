package br.com.tiago.party.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Aluno {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	@NotNull(message="{aluno.nome.vazio}")
	@Size(min=3,message="{aluno.nome.tamanho}")
	private String nomeAluno;
	
	private String paiAluno;
	
	private String maeAluno;
	
	private String enderecoAluno;
	
	private String telefone;
	
	private Calendar dataNascimento;
	
	private String obs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
        
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getPaiAluno() {
		return paiAluno;
	}

	public void setPaiAluno(String paiAluno) {
		this.paiAluno = paiAluno;
	}

	public String getMaeAluno() {
		return maeAluno;
	}

	public void setMaeAluno(String maeAluno) {
		this.maeAluno = maeAluno;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
