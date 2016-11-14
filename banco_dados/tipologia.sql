CREATE DATABASE tipologia;
USE tipologia;

CREATE TABLE Funcionario (
	CodFuncionario INT(11) AUTO_INCREMENT,
	Login VARCHAR(20),
	Senha VARCHAR(500),
	DhAcesso DATE DEFAULT '1900-01-01',
	DhSaida DATE DEFAULT '1900-01-01',
	XDEAD BOOLEAN DEFAULT FALSE,
/*CHAVE PRIMÁRIA*/
	PRIMARY KEY(CodFuncionario)
);

CREATE TABLE Componente(
	CodComponente INT(11) AUTO_INCREMENT,
	Nome VARCHAR(30),
	Altura DECIMAL(10,5),
	Largura DECIMAL(10,5),
	Massa DECIMAL(10,5),
	Preco DECIMAL(10,2),
	Tipo VARCHAR(10),
	FatorFogo INT(3) DEFAULT 0,
	FatorSom INT(3) DEFAULT 0,
	FatorUmidade INT(3) DEFAULT 0,
	FatorMecanico INT(3) DEFAULT 0,
	XDEAD BOOLEAN DEFAULT FALSE,
/*CHAVE PRIMÁRIA*/
	PRIMARY KEY(CodComponente)
);

CREATE TABLE Tipologia(
	CodTipologia INT(11) AUTO_INCREMENT,
	Altura DECIMAL(10,5),
	Largura DECIMAL(10,5),
	Preco DECIMAL(10,2),
	FatorFogo INT(3) DEFAULT 0,
	FatorSom INT(3) DEFAULT 0,
	FatorUmidade INT(3) DEFAULT 0,
	FatorMecanico INT(3) DEFAULT 0,
	XDEAD BOOLEAN DEFAULT FALSE,
/*CHAVE PRIMÁRIA*/
	PRIMARY KEY(CodTipologia)
);

CREATE TABLE TipologiaComponente( /*Dep. Tipologia, Componente; FRACA*/
	CodTipologia INT(11),
	CodComponente INT(11),
	XDEAD BOOLEAN DEFAULT FALSE,
/*CHAVE PRIMÁRIA*/
	PRIMARY KEY(CodTipologia,CodComponente),
/*CHAVES ESTRANGEIRAS*/
	FOREIGN KEY(CodTipologia) REFERENCES Tipologia(CodTipologia),
	FOREIGN KEY(CodComponente) REFERENCES Componente(CodComponente)
);

CREATE TABLE Pedido( /*Dep. Tipologia*/
	CodPedido INT(11) AUTO_INCREMENT,
	CodTipologia INT(11),
	CliNome VARCHAR(30),
	CliEndereco VARCHAR(100),
	CliTelefone VARCHAR(15),
	DataHora DATE DEFAULT '1900-01-01',
	XDEAD BOOLEAN DEFAULT FALSE,
/*CHAVE PRIMÁRIA*/
	PRIMARY KEY(CodPedido),
/*CHAVE ESTRANGEIRA*/
	FOREIGN KEY(CodTipologia) REFERENCES Tipologia(CodTipologia)
);

/*INSERIR FUNCIONÁRIO*/
INSERT INTO Funcionario
VALUES (NULL,'admin','123','1900-01-01','1900-01-01',FALSE),
(NULL,'ian_melo','123','1900-01-01','1900-01-01',FALSE),
(NULL,'fabio_mancini','123','1900-01-01','1900-01-01',FALSE),
(NULL,'felipe_martins','123','1900-01-01','1900-01-01',FALSE);
