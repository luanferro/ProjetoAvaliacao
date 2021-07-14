package com.luanferro.projetoAvaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luanferro.projetoAvaliacao.dao.nota.INotaDao;
import com.luanferro.projetoAvaliacao.model.NotaForm;
import com.luanferro.projetoAvaliacao.model.SituacaoAlunoForm;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/notas"})
public class NotaController {
	
	@Autowired
	INotaDao notaDao;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<SituacaoAlunoForm> listar(){
		return notaDao.listar();
	}
	
	@PostMapping
	public NotaForm salvar(@RequestBody NotaForm nota) {
		return notaDao.add(nota);
	}
	
	
}
