create table bookTBL(
	code number(4) primary key,
	title nvarchar2(50) not null, -- 가변문자열 형식 : varchar2(한글 : 3byte/영어 : 1byte) / nvarchar2(한글 : 1byte)
	writer nvarchar2(10) not null,
	price number(8)
);

insert into bookTBL values(1000,'이것이 자바다','신용균',28000);
insert into bookTBL values(1001,'자바의 신','강신용',29000);
insert into bookTBL values(1002,'자바의 정석','남궁성',27000);
insert into bookTBL values(1003,'자바 1000제','김용민',26000);