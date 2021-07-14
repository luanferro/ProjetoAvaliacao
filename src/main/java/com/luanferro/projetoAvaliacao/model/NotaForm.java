package com.luanferro.projetoAvaliacao.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_notas")
public class NotaForm {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idnotas;
	
	@Column
	private String aluno;
	
	@Column
	private int bimestre;
	
	@Column
	private int faltas;
	
	@Column
	private float notapresenca;
	
	@Column
	private float notaatividades;
	
	@Column
	private float notatrabalho;
	
	@Column
	private float notaprova;
	
	@Column
	private float mediabimestral;
	
	
	//GETTERS E SETTERS
	public int getIdnotas() {
		return idnotas;
	}

	public void setIdnotas(int idnotas) {
		this.idnotas = idnotas;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getBimestre() {
		return bimestre;
	}

	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}

	public float getMediabimestral() {
		return mediabimestral;
	}

	public void setMediabimestral(float mediabimestral) {
		this.mediabimestral = mediabimestral;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public float getNotapresenca() {
		return notapresenca;
	}

	public void setNotapresenca(float notapresenca) {
		this.notapresenca = notapresenca;
	}

	public float getNotaatividades() {
		return notaatividades;
	}

	public void setNotaatividades(float notaatividades) {
		this.notaatividades = notaatividades;
	}

	public float getNotatrabalho() {
		return notatrabalho;
	}

	public void setNotatrabalho(float notatrabalho) {
		this.notatrabalho = notatrabalho;
	}

	public float getNotaprova() {
		return notaprova;
	}

	public void setNotaprova(float notaprova) {
		this.notaprova = notaprova;
	}


}
