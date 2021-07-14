package com.luanferro.projetoAvaliacao.dao.nota;

import java.util.List;

import com.luanferro.projetoAvaliacao.model.NotaForm;
import com.luanferro.projetoAvaliacao.model.SituacaoAlunoForm;

public interface INotaDao {
	
	List<SituacaoAlunoForm> listar();
	
	NotaForm add(NotaForm nota);
}
