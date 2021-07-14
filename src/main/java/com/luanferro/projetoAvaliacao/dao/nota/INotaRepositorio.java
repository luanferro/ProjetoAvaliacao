package com.luanferro.projetoAvaliacao.dao.nota;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.luanferro.projetoAvaliacao.model.NotaForm;

public interface INotaRepositorio extends Repository<NotaForm, Integer>{
	
	List<NotaForm> findAll();
	
	NotaForm save(NotaForm nota);

}
