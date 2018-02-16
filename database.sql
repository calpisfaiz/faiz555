CREATE TABLE Thread(
	
	Thread_no 			NUMBER(4) 		PRIMARY KEY,
	Thread_title 		VARCHAR(20) 	NOT NULL,
	Thread_id 			NUMBER(4) 		NOT NULL,
	Thread_username 	VARCHAR(20) 	NOT NULL,
	Thread_res	 		NUMBER(20)	 	NOT NULL,
	Thread_title 		DATE		 	DEFAULT SYSDATE,
	Thread_title 		DATE		 	DEFAULT SYSDATE
);

CREATE TABLE Res(
	Thread_no 		NUMBER(4) 		PRIMARY KEY,
	Res_no 			NUMBER(4) 		REFERENCES Thread(Thread_no),
	Res_name 		VARCHAR(20) 	NOT NULL,
	Res_content 	VARCHAR(500) 	NOT NULL,
	Res_date 		DATE		 	DEFAULT SYSDATE
);

CREATE TABLE User(
	User_no 		NUMBER(4) 		PRIMARY KEY,
	User_name 		VARCHAR(20) 	UNIQUE,
	User_password 	VARCHAR(20) 	NOT NULL
);