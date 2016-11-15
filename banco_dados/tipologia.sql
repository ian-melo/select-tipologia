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
	Altura DECIMAL(12,5),
	Largura DECIMAL(12,5),
	Massa DECIMAL(12,5),
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
	Altura DECIMAL(12,5),
	Largura DECIMAL(12,5),
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

CREATE VIEW Tudo_Tipologia AS
SELECT 
tc.CodTipologia, tc.CodComponente, t.Altura AS TipAltura, t.Largura AS TipLargura, t.Preco AS TipPreco, t.FatorFogo AS TipFatorFogo, t.FatorSom AS TipFatorSom,
t.FatorUmidade AS TipFatorUmidade, t.FatorMecanico AS TipFatorMecanico, 
c.Nome, c.Altura, c.Largura, c.Massa, c.Preco, c.Tipo, c.FatorFogo, c.FatorSom, 
c.FatorUmidade, c.FatorMecanico
FROM TipologiaComponente tc 
INNER JOIN Tipologia t ON tc.CodTipologia = t.CodTipologia 
INNER JOIN Componente c ON tc.CodComponente = c.CodComponente 
WHERE t.XDEAD = FALSE;

/*INSERIR FUNCIONÁRIO*/
INSERT INTO Funcionario
VALUES (NULL,'admin','123','1900-01-01','1900-01-01',FALSE),
(NULL,'ian_melo','123','1900-01-01','1900-01-01',FALSE),
(NULL,'fabio_mancini','123','1900-01-01','1900-01-01',FALSE),
(NULL,'felipe_martins','123','1900-01-01','1900-01-01',FALSE);

/*INSERIR TIPOLOGIAS E COMPONENTES*/
INSERT INTO Componente VALUES
(null,'COMPONENTE 1','500.60','500.30','10000','66.89','CHAPA',30,60,70,75,FALSE);

INSERT INTO Componente VALUES (null,'COMPONENTE 2','500.60','500.30','3000','706.89','FORRO',30,60,70,75,FALSE);

INSERT INTO Componente VALUES (null,'COMPONENTE 3','0.60','0.30','10','0.89','PARAFUSO',30,5,70,60,FALSE);


INSERT INTO Tipologia VALUES
(null,'500.60','500.30','853.47',60,70,90,80,FALSE);

INSERT INTO TipologiaComponente VALUES
(1,1,FALSE);

INSERT INTO TipologiaComponente VALUES
(1,2,FALSE);

INSERT INTO TipologiaComponente VALUES
(1,3,FALSE);

