/*================================THREAD================================*/
CREATE TABLE Thread(
	
	Thread_no 			NUMBER(4) 		PRIMARY KEY,
	Thread_title 		VARCHAR(20) 	NOT NULL,
	Thread_username 	VARCHAR(20) 	NOT NULL,
	Thread_res	 		NUMBER(20)	 	NOT NULL,
	Thread_date 		DATE		 	DEFAULT SYSDATE,
	Thread_update 		DATE		 	DEFAULT SYSDATE
);

/*
 create table thread(
  2  thread_no number(4) primary key,
  3  thread_title varchar(20) not null,
  4  thread_username varchar(20) default 'NONAME',
  5  thread_res number(20) not null,
  6  thread_date date default sysdate,
  7  thread_update date default sysdate);
  
  insert into thread(thread_no,thread_title,thread_username,thread_res) values(0001,'test','Chun',10);
  insert into thread(thread_no,thread_title,thread_username,thread_res) values(0002,'test1','Chun',1);
  insert into thread(thread_no,thread_title,thread_username,thread_res) values(0003,'test2','Chun',4);
  insert into thread(thread_no,thread_title,thread_username,thread_res) values(0004,'test3','Chun',17);
  insert into thread(thread_no,thread_title,thread_username,thread_res) values(0005,'test4','Chun',8);
  insert into thread(thread_no,thread_title,thread_username,thread_res) values(0006,'test5','Chun',22);
*/
alter table thread drop column thread_id;
insert into thread(thread_no,thread_title,thread_username,Thread_res) 
values(0001,'Test','Chun',0);

/*================================RES================================*/


CREATE TABLE Res(
	Thread_no 		NUMBER(4) 		REFERENCES Thread(Thread_no),
	Res_no 			NUMBER(4) 		NOT NULL,
	Res_name 		VARCHAR(20) 	NOT NULL,
	Res_content 	VARCHAR(500) 	NOT NULL,
	Res_date 		DATE		 	DEFAULT SYSDATE
);

/*================================USER================================*/


CREATE TABLE BBSUser(
	User_no 		NUMBER(4) 		PRIMARY KEY,
	User_name 		VARCHAR(20) 	UNIQUE,
	User_password 	VARCHAR(20) 	NOT NULL,
	User_manager 	NUMBER(1)		DEFAULT 2
);

