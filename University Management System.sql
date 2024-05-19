create database universitymanagementsystem;
show databases;
use universitymanagementsystem; 
create table login(username varchar(25), password varchar(25));
insert into login values('admin','1,2,3,4,5');

insert into login values('Harsh Kumar Mishra','Harsh@979869');

select * from login;

create table student(name varchar(40), fname varchar(40), rollno varchar(20), dob varchar(40), address varchar(100), phone varchar(20), email varchar(40), class_x varchar(20), class_xii varchar(20), aadhar varchar(20), course varchar(40), branch varchar(40));
select * from student;

create table teacher(name varchar(40), fname varchar(40), empId varchar(20), dob varchar(40), address varchar(100), phone varchar(20), email varchar(40), class_x varchar(20), class_xii varchar(20), aadhar varchar(20), qualification varchar(40), department varchar(40));
drop table teacher;

create table teacher(name varchar(40), fname varchar(40), empId varchar(20), dob varchar(40), address varchar(100), phone varchar(20), email varchar(40), panNo varchar(20), salary varchar(20), aadhar varchar(20), qualification varchar(40), department varchar(40));
select * from teacher;

create table studentleave(rollno varchar(20),date varchar(50), duration varchar(20),hodname varchar(40),course varchar(20),branch varchar(20));
select * from studentleave;
create table studlogin(username varchar(25),password varchar(25));

drop table fee;

create table studentleave(rollno varchar(20),date varchar(50), duration varchar(20),course varchar(40),branch varchar(20),hodName varchar(20));
create table teacherleave(empId varchar(20), date varchar(50),duration varchar(20),dswname varchar(50));
select * from teacherleave;

create table subject(rollno varchar(20),semester varchar(20), subject1 varchar(50),subject2 varchar(50),subject3 varchar(50),subject4 varchar(50),subjec5 varchar(50));
create table marks(rollno varchar(20),semester varchar(20), marks1 varchar(10),marks2 varchar(10),marks3 varchar(10),marks4 varchar(10),marks5 varchar(10));
create table fee(course varchar(50),semester1 varchar(20),semester2 varchar(20),semester3 varchar(20),semester4 varchar(20),semester5 varchar(20),semeste6 varchar(20),semester7 varchar(20),semester8 varchar(20),TotalFee varchar(50));
select * from fee;

insert into fee values("BTECH","60000","60000","60000","60000","60000","60000","60000","45000","4,65,000");
insert into fee values("Bsc","5000","5000","5000","5000","5000","5000"," "," ","30,000");
insert into fee values("BA","3500","3500","3500","3500","3500","3500"," "," ","21,000");
insert into fee values("B.Ed","68,750","68,750","68,750","68,750"," "," "," "," ","2,50,000");
insert into fee values("B.Com","3500","3500","3500","3500","3500","3500"," "," ","21,000");
insert into fee values("M.B.A","35000","35000","35000","35000","35000","35000"," "," ","2,10,000");
insert into fee values("MA","2500","2500","2500","2500","2500","2500"," "," ","15,000");
create table collegefee(rollno varchar(20), course varchar(50), branch varchar(50), semester varchar(20), total varchar(20));

select * from collegefee;

select * from login;
drop table viewBook;
create table images(id int primary key auto_increment,pic blob);
select * from images;


