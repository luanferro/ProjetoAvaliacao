package com.luanferro.projetoAvaliacao.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_alunos")
public class AlunoForm {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idaluno;
	
	@Column
	private String nome;
	
	
	//GETTERS E SETTERS
	public int getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(int idaluno) {
		this.idaluno = idaluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
