CREATE SCHEMA IF NOT EXISTS bdAula3 DEFAULT CHARACTER SET utf8 ;
USE bdAula3 ;


CREATE TABLE IF NOT EXISTS usuarioA3 ( #criando tabela se nao existir
id int not null auto_increment,
nome varchar(45),
email varchar(45),
senha varchar(45),
primary key(id)
);

INSERT INTO usuarioA3(nome,email,senha) VALUES ('Alexandre','alexandre@email.com','12345');
INSERT INTO usuarioA3(nome,email,senha) VALUES ('Natanael','natanael12@email.com','ABCDE');
INSERT INTO usuarioA3(nome,email,senha) VALUES ('JUlia','julia_09@email.com','98765');
INSERT INTO usuarioA3(nome,email,senha) VALUES ('Fernanda','fernanda@email.com','EFGHI');
select * from usuarioA3; #função para visualizar a tabela

update usuarioA3 SET senha = '54321' WHERE id = '1'; #alterar a senha do usuario Alexandre
DELETE from usuarioA3 WHERE id = '4'; #apagando o usuario Fernanda
select * from usuarioA3; #Selecionando todos os usuarios

select * from usuarioA3 where nome like '%N%'; #Selecionando os usuarios que contem a letra N no nome



