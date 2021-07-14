package com.luanferro.projetoAvaliacao.dao.avaliacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luanferro.projetoAvaliacao.model.AvaliacaoForm;

@Service
public class AvaliacaoDaoImp implements IAvaliacaoDao{
	
	@Autowired
	private IAvaliacaoRepositorio repositorio;

	@Override
	public List<AvaliacaoForm> listar() {
		return repositorio.findAll();
	}

	@Override
	public AvaliacaoForm lstarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoForm add(AvaliacaoForm avaliacao) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
