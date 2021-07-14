package com.luanferro.projetoAvaliacao.dao.avaliacao;

import java.util.List;

import com.luanferro.projetoAvaliacao.model.AvaliacaoForm;

public interface IAvaliacaoDao {
	
	List<AvaliacaoForm> listar();
	
	AvaliacaoForm lstarId(int id);
	
	AvaliacaoForm add(AvaliacaoForm avaliacao);
	
}
