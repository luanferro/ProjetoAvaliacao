-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 14-Jul-2021 às 19:21
-- Versão do servidor: 10.4.20-MariaDB
-- versão do PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projetoavaliacao`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tab_alunos`
--

CREATE TABLE `tab_alunos` (
  `idaluno` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tab_alunos`
--

INSERT INTO `tab_alunos` (`idaluno`, `nome`) VALUES
(1, 'Pedro'),
(2, 'Maria'),
(3, 'Jose');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tab_avaliacoes`
--

CREATE TABLE `tab_avaliacoes` (
  `idavaliacao` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Peso` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tab_avaliacoes`
--

INSERT INTO `tab_avaliacoes` (`idavaliacao`, `Nome`, `Peso`) VALUES
(1, 'Participação em sala de aula', 1.5),
(2, 'Entrega de Tarefas', 2.5),
(3, 'Trabalho Bimestral', 3),
(4, 'Prova Bimestral', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tab_notas`
--

CREATE TABLE `tab_notas` (
  `idnotas` int(11) NOT NULL,
  `aluno` varchar(50) NOT NULL,
  `bimestre` int(11) NOT NULL,
  `faltas` int(11) NOT NULL,
  `notaPresenca` int(11) NOT NULL,
  `notaAtividades` double NOT NULL,
  `notaTrabalho` double NOT NULL,
  `notaProva` double NOT NULL,
  `mediaBimestral` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tab_alunos`
--
ALTER TABLE `tab_alunos`
  ADD PRIMARY KEY (`idaluno`);

--
-- Índices para tabela `tab_avaliacoes`
--
ALTER TABLE `tab_avaliacoes`
  ADD PRIMARY KEY (`idavaliacao`);

--
-- Índices para tabela `tab_notas`
--
ALTER TABLE `tab_notas`
  ADD PRIMARY KEY (`idnotas`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tab_alunos`
--
ALTER TABLE `tab_alunos`
  MODIFY `idaluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tab_avaliacoes`
--
ALTER TABLE `tab_avaliacoes`
  MODIFY `idavaliacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tab_notas`
--
ALTER TABLE `tab_notas`
  MODIFY `idnotas` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
