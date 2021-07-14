package com.luanferro.projetoAvaliacao.dao.aluno;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.luanferro.projetoAvaliacao.model.AlunoForm;

public interface IAlunoRepositorio extends Repository<AlunoForm, Integer>{

	List<AlunoForm> findAll();
	
	AlunoForm save(AlunoForm aluno);
	
}
