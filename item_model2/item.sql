create table item(
	num number primary key,
	category nvarchar2(30) not null,
	name nvarchar2(50) not null,
	content nvarchar2(100) not null,
	psize varchar2(30) not null,
	price number not null,
	register_at date default sysdate
);

create sequence item_seq;

insert into item(num,category,name,content,psize,price) values(item_seq.nextval, 'outwear', '바지', '파란색 바지 XL', 'XL', 38000);

select * from item;