Select * from student;

CREATE TABLE student
(
    id serial primary key ,
    name varchar(255),
    surname varchar(255),
    subject varchar(255),
    monthly_payment int ,
    start_date date,
    leave_date date,
    create_date timestamp,
    update_date timestamp,
    status int
);


INSERT INTO student(name, surname, subject, monthly_payment,start_date,create_date,status)
                                        VALUES
                                             ('Nihat','Guliyev','full-stack',200,('2022-11-19'),now(),1),
                                             ('Elchin','Huseynli','full-stack',210,('2022-11-19'),now(),1),
                                             ('Xedice','Madnayeva','backend',220,('2022-11-19'),now(),1),
                                             ('Emin','Guliyev','backend',230,('2022-11-19'),now(),1),
                                             ('Huseyn','elipenahov','fronted',240,('2022-11-19'),now(),1),
                                             ('Eli','Balayev','full-stack',250,('2022-11-19'),now(),1),
                                             ('Şehla','Abdulayeva','full-stack',260,('2022-11-19'),now(),1),
                                             ('Husniye','Qasimova','fronted',270,('2022-11-19'),now(),1),
                                             ('Natavan','Memmedova','backend',280,('2022-11-19'),now(),1),
                                             ('Farid','Huseynov','full-stack',290,('2022-11-19'),now(),1),
                                             ('Seid','Aliyev','backend',300,('2022-11-19'),now(),1),
                                             ('Elsen','Refiyev','fronted',310,('2022-11-19'),now(),1),
                                             ('Vusal','Cabbarov','fronted',320,('2022-11-19'),now(),1),
                                             ('Eli','Ceferov','full-stack',330,('2022-11-19'),now(),1),
                                             ('Eli','Huseynov','Security',340,('2022-11-19'),now(),1),
                                             ('Terlale','Ramazanova','fronted',350,('2022-11-19'),now(),1),
                                             ('Shovgu','Huseynli','full-stack',360,('2022-11-19'),now(),1),
                                             ('MirSaleh','Salayev','full-stack',370,('2022-11-19'),now(),1),
                                             ('Fatime','Bayramli','backend',380,('2022-11-19'),now(),1),
                                             ('Terlan','Cummiyev','backend',390,('2022-11-19'),now(),1);


SELECT * FROM student ORDER BY name; -- ADLARIN ELIFBA SIRASI

SELECT * FROM student WHERE subject = 'full-stack'; -- subjecti full stack olanlar

SELECT * FROM student WHERE name = 'eli'; -- name eli olanlar

SELECT * FROM student WHERE monthly_payment = 250; -- odenisi 250 olanlar;

Delete from student where subject='full-stack'; -- delete

Delete from student where subject='backend';    -- delete

Delete from student where subject='fronted';    -- delete

SELECT * FROM student  WHERE  subject= 'full-stack' ;  -- subjecte gore axtaris

SELECT count(subject) FROM student GROUP BY subject = 'full-stack';  -- subjecte gore group count

UPDATE student set subject = 'full-stack' where name = 'Vusal'; --update

SELECT DISTINCT subject FROM student; -- FERQLI SUBJECTLER (TEKRARLANMADAN )

SELECT * FROM student where monthly_payment  between 200 and 300 ; --  x ve y arsinda olan ayliq odenis

SELECT * FROM student where name like '%t';   --- her hasni herfe gore axtaric (contain)

SELECT sum(monthly_payment) FROM student;   -- ayliq odenislerin cemi

SELECT avg(monthly_payment) FROM student;   -- ayliq odenislerin ededi ortasi



--------------------------------------------------------------------------------------------------------------------

CREATE TABLE teacher
(
    İd serial primary key ,
	name varchar(255),
	Surname varchar(255),
	Subject varchar(255),
	Salary  int ,
	Start_date date,
	Leave_date date,
	Create_date timestamp,
	Update_date timestamp,
	Status int
);

INSERT INTO teacher(NAME, SURNAME, SUBJECT, SALARY, START_DATE, CREATE_DATE,  STATUS)
                                    VALUES   ('Farid','Tahmazov','full-stack',5000,('2022-11-19'),now(),1),
                                             ('Terane ','Nesirli','full-stack',5000,('2022-11-19'),now(),1),
                                             ('Aysel','Madnayeva','Riyaziyat',3000,('2022-11-19'),now(),1),
                                             ('Aygun','Guliyev','backend',4000,('2022-11-19'),now(),1),
                                             ('Tofiq','Guliyev','fronted',2000,('2022-11-19'),now(),1),
                                             ('Guleser','Rustemov','full-stack',3000,('2022-11-19'),now(),1),
                                             ('Heyat','Resulova','Tarix',2000,('2022-11-19'),now(),1),
                                             ('Rahim','Huseynli','fronted',2000,('2022-11-19'),now(),1),
                                             ('Rehile','Resulova','It',3000,('2022-11-19'),now(),1),
                                             ('Keramet','Memmedov','tarix',1,('2022-11-19'),now(),1),
                                             ('Melahet','Aliyeva','backend',2500,('2022-11-19'),now(),1),
                                             ('Elsen','Necefov','fronted',5000,('2022-11-19'),now(),1),
                                             ('Nicat','Cabbarov','fronted',4000,('2022-11-19'),now(),1),
                                             ('Eli','Ceferov','full-stack',3500,('2022-11-19'),now(),1),
                                             ('Samir','Bayramli','Security',5000,('2022-11-19'),now(),1),
                                             ('Nurlan','Ramazanli','fronted',4000,('2022-11-19'),now(),1),
                                             ('Xeyyam','Guliyev','backend',5000,('2022-11-19'),now(),1),
                                             ('Jale','Quliyeva','full-stack',5000,('2022-11-19'),now(),1),
                                             ('Haci','Elmarli','backend',3000,('2022-11-19'),now(),1),
                                             ('Nihat','Quliyev','backend',5000,('2022-11-19'),now(),1);



SELECT * FROM teacher ORDER BY name;


SELECT * FROM teacher where Subject = 'fronted';

SELECT  count(subject) FROM teacher GROUP BY Subject= 'fronted';

SELECT  sum(salary) FROM teacher;

SELECT  avg(salary) FROM teacher;

SELECT * FROM teacher  WHERE Salary BETWEEN 4000 AND 5000;

SELECT  DISTINCT  subject FROM teacher ;

UPDATE teacher set salary = 5000,update_date = now() where name='Aysel'  ;

DELETE from teacher where name = 'Keramet';

SELECT * FROM teacher WHERE name LIKE '%t';



--------------------------------------------------------------------------------------------------------------------------------


CREATE TABLE staff
(
    İd serial primary key ,
	name varchar(255),
	Surname varchar(255),
	position varchar(255),
	Salary  int ,
	Start_date date,
	Leave_date date,
	Create_date timestamp,
	Update_date timestamp,
	Status int
);

INSERT INTO staff(NAME, SURNAME, position, SALARY, START_DATE, CREATE_DATE,  STATUS)
                                    VALUES   ('Farid','Tahmazov','teacher',5000,('2022-11-19'),now(),1),
                                             ('Terane ','Nesirli','teacher',5000,('2022-11-19'),now(),1),
                                             ('Aysel','Madnayeva','teacher',3000,('2022-11-19'),now(),1),
                                             ('Aygun','Guliyev','manager',4000,('2022-11-19'),now(),1),
                                             ('Tofiq','Guliyev','manager',2000,('2022-11-19'),now(),1),
                                             ('Guleser','Rustemov','teacher',3000,('2022-11-19'),now(),1),
                                             ('Heyat','Resulova','teacher',2000,('2022-11-19'),now(),1),
                                             ('Rahim','Huseynli','manager',2000,('2022-11-19'),now(),1),
                                             ('Rehile','Resulova','direktor',3000,('2022-11-19'),now(),1),
                                             ('Keramet','Memmedov','ecar',1,('2022-11-19'),now(),1),
                                             ('Melahet','Aliyeva','teacher',2500,('2022-11-19'),now(),1),
                                             ('Elsen','Necefov','student',5000,('2022-11-19'),now(),1),
                                             ('Nicat','Cabbarov','student',4000,('2022-11-19'),now(),1),
                                             ('Eli','Ceferov','student',3500,('2022-11-19'),now(),1),
                                             ('Samir','Bayramli','teacher',5000,('2022-11-19'),now(),1),
                                             ('Nurlan','Ramazanli','student',4000,('2022-11-19'),now(),1),
                                             ('Xeyyam','Guliyev','student',5000,('2022-11-19'),now(),1),
                                             ('Jale','Quliyeva','student',5000,('2022-11-19'),now(),1),
                                             ('Haci','Elmarli','teacher',3000,('2022-11-19'),now(),1),
                                             ('Nihat','Quliyev','teacher',5000,('2022-11-19'),now(),1);



SELECT * FROM staff ORDER BY name;


SELECT * FROM staff where position = 'teacher';

SELECT  count(position) FROM staff GROUP BY position= 'student';

SELECT  sum(salary) FROM staff;

SELECT  avg(salary) FROM staff;

SELECT * FROM staff  WHERE Salary BETWEEN 4000 AND 5000;

SELECT  DISTINCT  position FROM staff ;

UPDATE staff set salary = 5000,update_date = now() where name='Aysel'  ;

DELETE from staff where name = 'Keramet';

SELECT * FROM staff WHERE name LIKE '%t';






