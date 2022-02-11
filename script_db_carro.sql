create database db_carro; 
use db_carro; 

create table veiculo (
 id_veiculo int(3) not null auto_increment,
 modelo varchar (40) not null,
 ano int(4) not null, 
 primary key(id_veiculo)
);
select * from veiculo;

create table ipva (
 id_ipva int(3) not null auto_increment,
 ano int(4) not null, 
 primary key(id_ipva)
);




