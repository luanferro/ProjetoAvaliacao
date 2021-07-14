package com.luanferro.projetoAvaliacao.dao.avaliacao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.luanferro.projetoAvaliacao.model.AvaliacaoForm;

public interface IAvaliacaoRepositorio extends Repository<AvaliacaoForm, Integer>{
	
	List<AvaliacaoForm> findAll();
	
	AvaliacaoForm save(AvaliacaoForm aluno);
	
}
