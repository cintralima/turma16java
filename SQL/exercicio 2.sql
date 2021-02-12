create database empresa_rh;
use empresa_rh;
CREATE TABLE tb_funcionario(
codigo bigint auto_increment,
nome varchar(255) not null,
salario double not null,
cargo varchar(255) not null,
faltas int not null,
primary key(codigo)
);

insert into tb_funcionario (nome,salario,cargo,faltas) values 
("leonardo",5000,"Programador",2);
insert into tb_funcionario (nome,salario,cargo,faltas) values 
("ana",5500,"Programadora",1);
insert into tb_funcionario (nome,salario,cargo,faltas) values 
("camila",8000,"Coordenadora",0);
insert into tb_funcionario (nome,salario,cargo,faltas) values 
("robson",3000,"Estagiario",2);
insert into tb_funcionario (nome,salario,cargo,faltas) values 
("tais",6000,"BI",1);



select nome, salario from tb_funcionario where salario > 5000;
select nome, salario from  tb_funcionario where salario < 5000;

update tb_funcionario set salario = 5500 where codigo = 1;
