drop database if exists faculdade;
create database faculdade;

use faculdade;

create table Aluno(
	matricula int not null,
    nome varchar(100) not null,
    idade int not null,
    periodo varchar(50) not null,
    primary key(matricula)
);

create table Professor(
	id int not null,
    nome varchar(100) not null,
    materia varchar(100) not null,
    primary key(id)
);

create table Avaliar(
	idAluno int not null,
    idProfessor int not null,
	CONSTRAINT fk1
    foreign key (idAluno) 
    references Aluno (matricula) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    CONSTRAINT fk2
    foreign key (idProfessor) 
    references Professor(id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    PRIMARY KEY(idAluno, idProfessor)
);

create table Prova(
	id int not null auto_increment,
    materia varchar(50) not null,
    idAluno int not null,
    nota float not null,
    primary key(id),
    CONSTRAINT fk3
    foreign key (idAluno) 
    references Aluno (matricula) 
    ON UPDATE CASCADE
);

#Questão 1: Falta na tabela o ON deleted cascade. 
#REALIZE A SEGUNDA QUESTÂO AQUI

ALTER TABLE Aluno ADD curso varchar(45);
ALTER TABLE Professor CHANGE materia disciplina varchar(100) not null;
ALTER TABLE Aluno DROP COLUMN idade;

insert into Aluno(matricula,nome,periodo,curso) values ('1','João','5 periodo','Eng.Computacao');
insert into Aluno(matricula,nome,periodo,curso) values ('2','Otávio','7 periodo','Eng.Computação');
insert into Aluno(matricula,nome,periodo,curso) values ('3','Shirlei','4 periodo','Eng.Biomedica');
insert into Aluno(matricula,nome,periodo,curso) values ('4','Isabela','8 periodo','Eng.Telecomunicacoes');
insert into Aluno(matricula,nome,periodo,curso) values ('5','Jose Augusto','3 periodo','Eng.Telecomunicacoes');

insert into Professor(id,nome,disciplina) values ('1','Renan','Calculo');
insert into Professor(id,nome,disciplina) values ('2','Daniela','Fisica');
insert into Professor(id,nome,disciplina) values ('3','Renzo','Algoritmos');

insert into Avaliar(idProfessor, idAluno) values
('1', '1'),
('1', '2'),
('1', '3'),
('1', '4'),
('2', '3'),
('2', '5'),
('3', '1'),
('3', '2'),
('3', '4');

insert into Prova(materia, nota, idAluno) values
('Calculo', '8.0', '1'),
('Algoritmos', '9.0', '1'),
('Fisica', '9.0', '2'),
('Calculo', '4.0', '3'),
('Fisica', '9.0', '4'),
('Algoritmos', '8.0', '4'),
('Calculo', '7.0', '4'),
('Algoritmos', '8.0', '3'),
('Fisica', '9.0', '1'),
('Calculo', '8.0', '2');

#Dropando se existir
DROP USER IF EXISTS 'User123','Adm','SubAdmin';
FLUSH PRIVILEGES;

#Criando os usuarios
CREATE USER 'User123' IDENTIFIED BY 'senha123';
CREATE USER 'Adm' IDENTIFIED BY 'Administrador';
CREATE USER 'SubAdmin' IDENTIFIED BY 'Sub123';

#Dando o privilegio
GRANT UPDATE ON faculdade.professor TO 'Adm';
GRANT SELECT(matricula, nome, curso) ON faculdade.aluno TO 'SubAdmin';
GRANT ALL PRIVILEGES ON faculdade.aluno TO 'User123';

#Retirar os previlegios
REVOKE INSERT,UPDATE ON faculdade.aluno FROM 'User123';

#Mostra os previlegios
SHOW GRANTS FOR 'User123';
SHOW GRANTS FOR 'Adm';
SHOW GRANTS FOR 'SubAdmin';

# 4 A 

SELECT a.nome, p.nota FROM aluno as a, prova as p WHERE matricula = id and nota = 9;