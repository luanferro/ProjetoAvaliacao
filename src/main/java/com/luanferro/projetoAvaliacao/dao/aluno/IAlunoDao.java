package com.luanferro.projetoAvaliacao.dao.aluno;

import java.util.List;

import com.luanferro.projetoAvaliacao.model.AlunoForm;

public interface IAlunoDao {

	List<AlunoForm> listar();
	
	AlunoForm listarId(int id);
	
	AlunoForm add(AlunoForm aluno);
	
}
