drop table if exists customer;

create table customer (
	id identity,
	firstname varchar(25) not null,
	lastname varchar(25) not null,
	email varchar(25) not null
);
