package com.luanferro.projetoAvaliacao.dao.nota;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luanferro.projetoAvaliacao.model.AlunoForm;
import com.luanferro.projetoAvaliacao.model.NotaForm;
import com.luanferro.projetoAvaliacao.model.SituacaoAlunoForm;


@Service
public class NotaDaoImp implements INotaDao {
	
	
	@Autowired
	private INotaRepositorio repositorio;
	
	@PersistenceContext
	public EntityManager em;
	
	@Override
	public List<SituacaoAlunoForm> listar() {
		
	    List<SituacaoAlunoForm> situacoes = listarSituacoes(); 
		

	    return situacoes;
	}

	@Override
	public NotaForm add(NotaForm nota) {
		
		nota.setMediabimestral(
				 calcularMediaBimestral(nota.getNotapresenca(), 
						 				nota.getNotaatividades(), 
						 				nota.getNotatrabalho(), 
						 				nota.getNotaprova(), 
						 				1.5, 
						 				2.5,
						 				3, 
						 				3));		
			
		return repositorio.save(nota);
	}
	
	
	@SuppressWarnings("null")
	public List<SituacaoAlunoForm> listarSituacoes() {
		
		  List<SituacaoAlunoForm> situacoes = new ArrayList<SituacaoAlunoForm>();
		
		  try {
			// cria uma lista com os alunos cadastrados 
			  List<AlunoForm> alunos = listarTodosAlunos();
			  
			  //laco para iterar os alunos existentes e retornar os dados equivalentes a cada um 
			  for(AlunoForm aluno : alunos) {
				  
				  //objeto da situacao do aluno 
				  SituacaoAlunoForm situacaoAluno = new SituacaoAlunoForm();
				  
				  //cria uma lista das notas de um determinado aluno 
				  List<NotaForm> notasAluno = listarNotasAluno(aluno.getNome());
				  
				  if(!notasAluno.isEmpty()) {
					  //variavel da media final do aluno 
					  float mediaFinal = 0;
					  int faltas = 0;
					  
					  //laco para iterar todas as notas de um determinado aluno 
					  for(NotaForm nota : notasAluno) {
					  
						  //somatorio da media final 
					      mediaFinal += nota.getMediabimestral();
					      
					      //somatario das faltas
					      faltas += nota.getFaltas();
						  
						  //verificacao do bimestre para inserir a media do bimestre no seu campo equivalente 
						  if(nota.getBimestre() == 1) {
							  situacaoAluno.setBimestre1(formatador(nota.getMediabimestral()));
						  } else if(nota.getBimestre() == 2) {
						 	  situacaoAluno.setBimestre2(formatador(nota.getMediabimestral())); 
					      } else if(nota.getBimestre() == 3) {
							  situacaoAluno.setBimestre3(formatador(nota.getMediabimestral())); 
						  } else {
							  situacaoAluno.setBimestre4(formatador(nota.getMediabimestral())); 
						  }
					  
					  } //fim laco notas
					  
					  //setar os dados no objeto da situacao do aluno
					  situacaoAluno.setMediaFinal(formatador(mediaFinal/4));
					  situacaoAluno.setAluno(aluno.getNome()); 
					  situacaoAluno.setFaltas(faltas);
					  
					  //verificacao da situacao do aluno de acordo com as regras de aprovacao 
					  //Ano Letivo possui 160 dias(4 bimestres de 40) --> presenca de 75% equivale a 120 dias 
					  if(situacaoAluno .getMediaFinal() < 5 || situacaoAluno.getFaltas() > 40) { 
						 situacaoAluno.setSituacao("Reprovado"); 
					  } else if(situacaoAluno.getMediaFinal() > 6 && situacaoAluno.getFaltas() < 40) {
						 situacaoAluno.setSituacao("Aprovado"); 
					  } else {
						 situacaoAluno.setSituacao("Em Recuperação"); }
					   
					  //transformar faltas na porcentagem de presenca
					  situacaoAluno.setPorcentagemFaltas(calcularPorcentagem(faltas) + " %");
					  
					  
					  situacoes.add(situacaoAluno);
				  }
				  
				  
				  
			 }//fim laco alunos
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
			e.printStackTrace();	
		}
		  
		  return situacoes; 
	}
	 
	//metodo para retornar todos as notas de um aluno a partir de uma query nativa sql
	@SuppressWarnings("unchecked")
	public List<NotaForm> listarNotasAluno(String nome) {
		return em.createQuery(
		    "SELECT n FROM NotaForm n WHERE n.aluno LIKE :aluno")
		    .setParameter("aluno", nome)
		    .getResultList();
		}
	
	//metodo para retornar todos os alunos a partir de uma query nativa sql
	@SuppressWarnings("unchecked")
	public List<AlunoForm> listarTodosAlunos() {
		return em.createQuery(
		    "SELECT n FROM AlunoForm n")
		    .getResultList();
		}
	
	//metodo para formatar os valores com apenas 2 casas decimais
	public Float formatador(float numero) {
		BigDecimal valor = new BigDecimal(numero);
		valor = valor.setScale(2, BigDecimal.ROUND_HALF_UP);	
		float valorFormatado = valor.floatValue();
		return valorFormatado;
	}
	
	//metodo para calcular a porcentagem das faltas
	public Float calcularPorcentagem(int faltas) {
		Float porcentagemFaltas;	
		porcentagemFaltas = (float) (160 - faltas)/160 ;
		porcentagemFaltas = formatador(porcentagemFaltas * 100);
		return porcentagemFaltas;
	}
	
	
	// CALCULO DA MEDIA BIMESTRAL
	public Float calcularMediaBimestral(float nota1, float nota2, float nota3,float nota4, 
										double peso1, double peso2, double peso3, double peso4) {
		
		float mediaBimestral = (float) (((nota1 * peso1) + 
										 (nota2 * peso2) +
										 (nota3 * peso3) + 
										 (nota4 * peso4)) / 10);
		
		return mediaBimestral;
	}
}
