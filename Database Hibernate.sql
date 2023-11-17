drop database registroFinancas;

create database registroFinancas;

use registroFinancas;

create table entrada (
	id int primary key auto_increment,
    categoria varchar(255),
    valor float
);

create table saida (
	id int primary key auto_increment,
    categoria varchar(255),
    valor float
);

select * from entrada;
select * from saida;