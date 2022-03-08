drop database if exists aula4;
create database aula4;
use aula4;

create table if not exists pessoa(
	id int not null auto_increment primary key,
    nome varchar(45),
    endereco varchar(45),
    cargo varchar(45)
);

create table empresa(
	matricula int not null auto_increment primary key,
    nome varchar(45),
    cpf varchar(45),
    cargo varchar(45),
    nProjetos int
);

create table aluno(
	matricula int not null primary key,
    nome varchar(45),
    endereco varchar(45),
    ano_nasc int,
    curso varchar(45)
);