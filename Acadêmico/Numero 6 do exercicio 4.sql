CREATE SCHEMA IF NOT EXISTS aula DEFAULT CHARACTER SET utf8 ;
USE aula ;


CREATE TABLE IF NOT EXISTS exercicio ( #criando tabela se nao existir
id int not null auto_increment,
nome varchar(45),
endereco varchar(45),
cargo varchar(45),
primary key(id)
);

INSERT INTO exercicio(nome,endereco,cargo) VALUES ('Markin','Rua Aneis de Saturno, 420','Piloto de Disco voador');
INSERT INTO exercicio(nome,endereco,cargo) VALUES ('Tonin','Rua de Marte, 840','Caçador de gnomos');
INSERT INTO exercicio(nome,endereco,cargo) VALUES ('Bilu','Rua dos Aligenigena, 110','Desenhista na plantação de milho');

update exercicio set endereco = 'Rua do Caju, 777' where id = '2'; #atualizando o endereço do segundo registro 

select nome, cargo from exercicio; #consultando tabela e mostrando somente o nome e o cargo dos registros

DELETE from exercicio WHERE id = '3'; #apagando o ultimo usuario
select * from exercicio; #função para visualizar a tabela
