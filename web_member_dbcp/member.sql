create table membertbl(
	userid varchar2(15) primary key,
	password varchar2(20) not null,
	name nvarchar2(10) not null,
	gender nvarchar2(2) not null,
	email varchar2(50) not null
);

insert into membertbl values('hong123','hong123@','홍길동','남','hong123@naver.com');
insert into membertbl values('kim123','kim123@','김길동','남','kim123@naver.com');

select * from membertbl;
