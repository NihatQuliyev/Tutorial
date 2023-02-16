CREATE DATABASE div_academy2; -- create database table

CREATE SCHEMA public;   -- create public schema table

CREATE TABLE teacher_row_info  -- create teacher row info table
(
    id serial primary key ,
    create_date timestamp,
    update_date timestamp,
    status int
);

CREATE TABLE student_row_info -- create student row info table
(
    id serial primary key ,
    create_date timestamp,
    update_date timestamp,
    status int
);

CREATE TABLE teacher   -- create teacher table
(
    id serial primary key ,
    name varchar(255),
    surname varchar(255),
    salary int,
    start_date date,
    leave_date date,
    teacher_row_info_id int,

    foreign key (teacher_row_info_id) references teacher_row_info    -- foreign key - teacher row info id

);

CREATE TABLE student  -- create student
(
    id serial primary key ,
    name varchar(255),
    surname varchar(255),
    fee int,
    start_date date,
    leave_date date,
    teacher_id int,
    student_row_info_id int,

    foreign key (student_row_info_id) references student_row_info,   -- foreign key
    foreign key (teacher_id) references teacher  -- foreign key
);

INSERT INTO teacher_row_info(create_date, update_date , status)  --  Insert teacher row info
                                                    VALUES
                                                    (now(),now(),1),
                                                    (now(),now(),1);




INSERT INTO student_row_info(create_date, update_date , status)  -- Insert student row info
                                                    VALUES
                                                    (now(),now(),1),
                                                    (now(),now(),1);




INSERT INTO teacher(name, surname, salary, start_date, leave_date, teacher_row_info_id)  -- Insert teacher
                                                    VALUES
                                                    ('Farid' , 'Tahmazov', 6250 ,date('2022-11-19') ,null ,
                                                    (SELECT id FROM teacher_row_info ORDER BY id DESC LIMIT 1)),
                                                    ('Terane' , 'Nesirli', 6250 ,date('2022-11-19') ,null ,
                                                    (SELECT id FROM teacher_row_info ORDER BY id DESC LIMIT 1));



INSERT INTO student(name, surname, fee, start_date, leave_date, teacher_id, student_row_info_id) -- Insert student
                                                    VALUES
                                                    ('Nihat' , 'Quliyev', 6250 ,date('2022-11-19') ,null ,
                                                    (SELECT ID FROM teacher ORDER BY id DESC LIMIT 1),
                                                    (SELECT ID FROM student_row_info ORDER BY id DESC LIMIT 1)
                                                    ),('Elchin' , 'Huseynli', 6250 ,date('2022-11-19') ,null ,
                                                    (SELECT ID FROM teacher ORDER BY id DESC LIMIT 1),
                                                    (SELECT ID FROM student_row_info ORDER BY id DESC LIMIT 1)
                                                    );

UPDATE  student  SET teacher_id = 1   WHERE ID = 2 ;              -- Update student teacher_id
UPDATE student_row_info SET update_date = now() WHERE ID = 2;     -- Update student update_date
UPDATE teacher_row_info SET update_date = now() WHERE ID = 1;     -- Update teacher update_date


SELECT s.id  , s.name as stundent_name  ,s.surname as student_surname, fee ,s.start_date ,   -- (
       t.name as teacher_name,t.surname as teacher_surname
FROM student s                                                                                -- Select Join (cedvellerin birlesdirerek consolda gormek)
INNER JOIN teacher t ON s.teacher_id = t.id
INNER JOIN student_row_info sri on s.student_row_info_id = sri.id where status = 1;           -- )

UPDATE student_row_info set status = 0 ,update_date = now()                                                 -- Delete(status update) - (
                                        WHERE id = (select student_row_info_id from student WHERE id = 1)   -- sadece biz cagirdiqda gorsenmir ama cedvelde qalib








