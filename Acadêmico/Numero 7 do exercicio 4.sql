CREATE SCHEMA IF NOT EXISTS aula DEFAULT CHARACTER SET utf8 ;
USE aula ;


CREATE TABLE IF NOT EXISTS empresa ( #criando tabela se nao existir
id int not null auto_increment,
nome varchar(45),
cpf varchar(45),
cargo varchar(45),
nProjeto decimal,
primary key(id)
);
#inserindo os dados na tabela
INSERT INTO empresa(nome,cpf,cargo,nProjeto) VALUES ('Alexandre','000.000.000-00','GP','2');
INSERT INTO empresa(nome,cpf,cargo,nProjeto) VALUES ('Natanael','111.111.111-11', 'Desenvolvedor', '4');
INSERT INTO empresa(nome,cpf,cargo,nProjeto) VALUES ('Rochelle','222.222.222-22','Tester','3');
INSERT INTO empresa(nome,cpf,cargo,nProjeto) VALUES ('Jane', '333.333.333-33','Desenvolvedor','5');

#busca do usuario com maior numero de projetos
select max(nProjeto)
from empresa;

#media aritmetica do numero de projeto dos funcionarios que nao sao GP
 select avg(nProjeto)
 from empresa
 where cargo != 'GP';
 
 
