package com.luanferro.projetoAvaliacao.model;


public class SituacaoAlunoForm {
	
	
	private String aluno;
	
	private float bimestre1;
	
	private float bimestre2;	
	
	private float bimestre3;	
	
	private float bimestre4;	
	
	private float mediaFinal;	
	
	private int faltas;
	
	private String situacao;
	
	private String porcentagemFaltas;
	
	
	//GETTERS E SETTERS
	
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public float getBimestre1() {
		return bimestre1;
	}

	public void setBimestre1(float bimestre1) {
		this.bimestre1 = bimestre1;
	}

	public float getBimestre2() {
		return bimestre2;
	}

	public void setBimestre2(float bimestre2) {
		this.bimestre2 = bimestre2;
	}

	public float getBimestre3() {
		return bimestre3;
	}

	public void setBimestre3(float bimestre3) {
		this.bimestre3 = bimestre3;
	}

	public float getBimestre4() {
		return bimestre4;
	}

	public void setBimestre4(float bimestre4) {
		this.bimestre4 = bimestre4;
	}

	public float getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(float mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getPorcentagemFaltas() {
		return porcentagemFaltas;
	}

	public void setPorcentagemFaltas(String porcentagemFaltas) {
		this.porcentagemFaltas = porcentagemFaltas;
	}	
	
	
}
