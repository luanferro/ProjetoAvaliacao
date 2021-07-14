package com.luanferro.projetoAvaliacao.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_avaliacoes")
public class AvaliacaoForm {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idavaliacao;
	
	@Column
	private String nome;
	
	@Column
	private float peso;
	
	
	//GETTERS E SETTERS
	public int getIdAvaliacao() {
		return idavaliacao;
	}

	public void setIdAvaliacao(int idavaliacao) {
		this.idavaliacao = idavaliacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
}
