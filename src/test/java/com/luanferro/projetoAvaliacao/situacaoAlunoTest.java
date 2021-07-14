package com.luanferro.projetoAvaliacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.luanferro.projetoAvaliacao.dao.nota.NotaDaoImp;

class situacaoAlunoTest {

	@Test
	void mediaCorretaTest() {
		
		NotaDaoImp notaDao = new NotaDaoImp();
		
		float media = notaDao.calcularMediaBimestral(8,   7,   9,   5,   1.5,   2.5,   3.0,   3.0);
									
		Assertions.assertEquals((float) 7.15, media);
		
	}
	
	@Test
	void porcentagemFaltasTest() {
		
		NotaDaoImp notaDao = new NotaDaoImp();
		
		float porcentagemFaltas = notaDao.calcularPorcentagem(35);
		
		Assertions.assertEquals((float) 78.13, porcentagemFaltas);
	}


}
