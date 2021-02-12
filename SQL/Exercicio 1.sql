create database ecommerce;
use ecommerce;
CREATE TABLE tb_produtos(
codigo bigint auto_increment,
nome varchar(255) not null,
valor double not null,
categoria varchar(255) not null,
estoque int not null,
primary key(codigo)
);

insert into tb_produtos (nome,valor,categoria,estoque) values 
("Samsung S21",5000,"CELULAR",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("Iphone 12",8000,"CELULAR",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("Mouse Logitech G603",350,"INFORMATICA",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("Camiseta GAMER",68,"VESTUARIO",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("Teclado Mecanico Corsair",500,"INFORMATICA",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("Monito 24 IPS SAMUSNG ",1200,"INFORMATICA",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("PEN DRIVE 16GB",32,"INFORMATICA",10);
insert into tb_produtos (nome,valor,categoria,estoque) values 
("HEADSET LOGITECH",420,"INFORMATICA",10);

select codigo, nome, valor from tb_produtos where valor > 500;
select nome, valor from  tb_produtos where valor < 500;

update tb_produtos set valor = 45 where codigo = 7;








