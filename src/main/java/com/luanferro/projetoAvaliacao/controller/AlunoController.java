package com.luanferro.projetoAvaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luanferro.projetoAvaliacao.dao.aluno.IAlunoDao;
import com.luanferro.projetoAvaliacao.model.AlunoForm;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/alunos"})
public class AlunoController {
		
	@Autowired
	IAlunoDao alunoDao;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<AlunoForm> listar(){
		return alunoDao.listar();
	}
}
