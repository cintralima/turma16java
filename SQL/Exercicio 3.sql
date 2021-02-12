create database escola;
use escola;
CREATE TABLE tb_alunos(
codigo bigint auto_increment,
nome varchar(255) not null,
nota double not null,
turma varchar(255) not null,
faltas int not null,
primary key(codigo)
);

insert into tb_produtos (nome,nota,turma,faltas) values 
("PEDRO",6,"2B",5);
insert into tb_produtos (nome,nota,turma,faltas) values 
("RODOLFO",4,"4C",3);
insert into tb_produtos (nome,nota,turma,faltas) values 
("JAQUE",8,"2B",6);
insert into tb_produtos (nome,nota,turma,faltas) values 
("LUCAS",10,"1C",1);
insert into tb_produtos (nome,nota,turma,faltas) values 
("CAMILA",7,"2B",2);
insert into tb_produtos (nome,nota,turma,faltas) values 
("LEONARDO",9,"1C",4);
insert into tb_produtos (nome,nota,turma,faltas) values 
("ROBSON",3,"4C",5);



select nome, nota from tb_alunos where nota > 7;
select nome, nota from tb_alunos where nota < 7;


update tb_alunos set nota  = 9 where codigo = 4;

