CREATE TABLE teacher(
id int primary key auto_increment,
name varchar(255),
email varchar(255),
phone varchar(255),
age int
);
INSERT INTO teacher(name,email,phone,age) VALUES ('teacher','teacher','teacher',50);
CREATE TABLE student(
id int primary key auto_increment,
tid int,
name varchar(255),
address varchar(255),
phone varchar(255),
age int
);
CREATE PROCEDURE getStudent() SELECT * FROM student;