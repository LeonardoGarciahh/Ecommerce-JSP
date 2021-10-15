-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06-Out-2021 às 01:46
-- Versão do servidor: 10.4.20-MariaDB
-- versão do PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ecommerce`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `idProduto` int(11) NOT NULL,
  `nome` varchar(60) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `descricao` varchar(500) DEFAULT NULL,
  `maxParcela` int(11) DEFAULT NULL,
  `link` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nome`, `valor`, `descricao`, `maxParcela`, `link`) VALUES
(7, 'HEADSET HYPERX', 1200, '', 2, 'img/headset-hyperx-cloud-ii-kingston-red-khx-hscp-rd_24084.png'),
(17, 'XBOX ONE', 1200, '', 6, 'img/i413220.png'),
(18, 'Mouse Gamer T-Dagger', 100, 'O Mouser gamer T-Dagger Private 800DPI com 8 botÃÂµes RGB ÃÂ© um mouse com um design ergonÃÂ´mico. Possui oito botÃÂµes programÃÂ¡veis, com dois deles na lateral. Este mouse para jogos ÃÂ© preciso com uma taxa de polling de atÃÂ© 1000Hz.', 6, 'https://img.terabyteshop.com.br/produto/g/mouse-gamer-t-dagger-camaro-rgb-8000-dpi-8-botoes-black-t-tgm306_94318.png'),
(19, 'Smart TV 32', 1200, 'A Samsung LED Smart TV J4290 conta com os recursos essenciais para uma Smart TV.  Navegue pela Internet , assista os vÃÂÃÂ­deos no Youtube , Netflix e explore uma variedade de aplicativos disponÃÂÃÂ­veis.', 6, 'https://images-americanas.b2w.io/produtos/01/00/offers/01/02/item/133791/1/133791184_1GG.png'),
(21, 'Controle Xbox One', 299, 'Com o Controle sem Fio Xbox One Branco com Bluetooth da Microsoft garanta uma experiÃªncia de imersÃ£o ao jogar os seu games preferidos. Equipe-se com o Controle sem fio Xbox, com um design elegante o e maior conforto. Aproveite o m...', 3, 'https://www.techmania.net.br/image/cache/catalog/produtos/ControlePretoXboxOne-800x800.png');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `senha` varchar(500) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `dtNascimento` varchar(20) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nome`, `email`, `senha`, `cpf`, `dtNascimento`, `sexo`, `telefone`) VALUES
(1, 'Teste Beta', 'teste@hotmail.com', 'E58F87C992E9C0CF18B8BF376CBA3C35C3B2E76DC588EA326179292384807764', '22222222222', '2021-10-13', 0, '22222222');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `idVenda` int(11) NOT NULL,
  `date` varchar(20) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `cartao` varchar(20) DEFAULT NULL,
  `codSeguranca` int(11) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `idProduto` int(11) DEFAULT NULL,
  `cancelada` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`idVenda`, `date`, `idUsuario`, `cartao`, `codSeguranca`, `valor`, `idProduto`, `cancelada`) VALUES
(1, '2021-10-05', 1, '1121212121212121', 123, 2400, 19, 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idProduto`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Índices para tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`idVenda`),
  ADD KEY `idUsuario` (`idUsuario`),
  ADD KEY `idProduto` (`idProduto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `idVenda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`),
  ADD CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
