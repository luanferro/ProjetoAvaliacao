package com.luanferro.projetoAvaliacao.dao.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luanferro.projetoAvaliacao.model.AlunoForm;

@Service
public class AlunoDaoImp implements IAlunoDao {
	
	@Autowired
	private IAlunoRepositorio repositorio;

	@Override
	public List<AlunoForm> listar() {
		return repositorio.findAll();
	}

	@Override
	public AlunoForm listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlunoForm add(AlunoForm aluno) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
