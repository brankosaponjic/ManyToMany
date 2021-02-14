create database mydb;

use mydb;

create table programmer(
id int primary key auto_increment,
name varchar(20),
salary decimal(8,3)
);

create table project(
id int primary key auto_increment,
name varchar(20)
);

create table programmers_projects(
programmer_id int,
project_id int,
foreign key (programmer_id)
references programmer(id),
foreign key (project_id)
references project(id)
);