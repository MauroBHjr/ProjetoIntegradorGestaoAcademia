create schema devN211Mauro;

create table usuario
(
	idUsuario INT PRIMARY KEY AUTO_INCREMENT,
	nomeUsuario VARCHAR(255) NOT NULL,
	usuario VARCHAR(255) NOT NULL UNIQUE,
	senha VARCHAR(255) NOT NULL
);

create table pessoa
(
	idPessoa INT Primary Key NOT NULL AUTO_INCREMENT,
	nomePessoa VARCHAR(255) NOT NULL,
	rgPessoa VARCHAR(12) NOT NULL UNIQUE,
	cpfPessoa VARCHAR(14) NOT NULL UNIQUE,
	enderecoPessoa VARCHAR(255) NOT NULL,
	enderecoPessoaComplemento VARCHAR(255),
	telefonePessoa01 VARCHAR(255) NOT NULL,
	telefonePessoa02 VARCHAR(255),
	emailAdressPessoa01 VARCHAR(255) NOT NULL,
	emailAdressPessoa02 VARCHAR(255),
	birthdayPessoa DATE NOT NULL,
	idade TINYINT (255) NOT NULL,
	sexoPessoa VARCHAR(255),
	notificaEmail BOOLEAN,
    notificaPromo BOOLEAN
);