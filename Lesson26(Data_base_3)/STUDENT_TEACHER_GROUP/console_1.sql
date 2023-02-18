CREATE DATABASE Div_Academy_3;

CREATE TABLE student_row_info
(
    id serial primary key ,
    create_date date default now(),
    update_date date ,
    status int default 1
);

CREATE TABLE teacher_row_info
(
    id serial primary key ,
    create_date date default now(),
    update_date date ,
    status int default 1
);

CREATE TABLE group_row_info
(
    id serial primary key ,
    create_date date default now(),
    update_date date ,
    status int default 1
);

CREATE TABLE student
(
    id serial primary key ,
    name varchar ,
    surname varchar ,
    major varchar ,
    fee int ,
    start_date date ,
    leave_date date ,
    student_row_info_id int ,

    foreign key (student_row_info_id) references student_row_info
);

CREATE TABLE teacher
(
    id serial primary key ,
    name varchar ,
    surname varchar ,
    position varchar ,
    salary int ,
    start_date date ,
    leave_date date ,
    teacher_row_info_id int,

    foreign key (teacher_row_info_id) references teacher_row_info
);

CREATE TABLE _group_
(
    id serial primary key ,
    name varchar ,
    group_row_info_id int,

    foreign key (group_row_info_id) references group_row_info

);

CREATE TABLE student_teacher_group
(
    id serial primary key,
    student_id int,
    teacher_id int,
    group_id   int,

    foreign key (student_id) references student,

    foreign key (teacher_id) references teacher,

    foreign key (group_id) references _group_
);

INSERT INTO student_row_info(update_date) VALUES (now()),(now()),(now()),
                                                  (now()),(now()),(now()),
                                                  (now()),(now()),(now()),
                                                  (now());

INSERT INTO  student(name, surname, major, fee, start_date, student_row_info_id) VALUES
                                                 ('Nihat','Guliyev','Backend Dev',390,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  LIMIT  1)),
                                                 ('ELCHIN','Huseynli','Fronted Dev',400,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 1 LIMIT 1)),
                                                 ('Xadija','Madnayeva','Backend Dev',320,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 2 LIMIT 1)),
                                                 ('Emin','Guliyev','Backend Dev',390,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 3 LIMIT 1)),
                                                 ('Hasan','Huseynov','Fronted Dev',390,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 4 LIMIT 1)),
                                                 ('Leman','Khudatzade','Backend Dev',390,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 5 LIMIT 1)),
                                                 ('Nurlan','Cahangirzade','Fronted Dev',390,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 6 LIMIT 1)),
                                                 ('Haci','Guliyev','Fronted Dev',300,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 7 LIMIT 1)),
                                                 ('Ilyas','Bayramov','Fronted Dev',250,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 8 LIMIT 1)),
                                                 ('Murad','Memedli','Backend Dev',350,('2022-11-19'),(SELECT id FROM student_row_info ORDER BY id  offset 9 LIMIT 1));



INSERT INTO teacher_row_info(update_date) VALUES (now()),(now());

INSERT INTO  teacher(name, surname, position, salary, start_date, teacher_row_info_id) VALUES
                                                 ('Farid','Tahmazov','Backend Dev',4000,('2022-11-19'),(SELECT id FROM teacher_row_info ORDER BY id  LIMIT  1)),
                                                 ('Fidan','Necefova','Fronted Dev',4000,('2022-11-19'),(SELECT id FROM teacher_row_info ORDER BY id  offset 1 LIMIT 1));


INSERT INTO group_row_info(update_date) VALUES (now()),(now());

INSERT INTO _group_(name, group_row_info_id) VALUES ('Backend Dev',(SELECT id FROM group_row_info ORDER BY id LIMIT 1)),
                                                    ('Fronted Dev',(SELECT id FROM group_row_info ORDER BY id OFFSET 1 LIMIT 1));


INSERT INTO student_teacher_group(student_id, teacher_id, group_id) VALUES
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 1 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 1 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 1 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 2 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 2 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 2 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 3 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 3 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 3 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 4 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 4 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 4 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 5 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 5 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 5 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 6 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 6 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 6 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 7 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 7 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 7 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 8 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 8 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 8 LIMIT 1)),
        ((SELECT s.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 9 LIMIT 1),(SELECT t.id  FROM student s INNER JOIN teacher t on s.major = t.position OFFSET 9 LIMIT 1),(SELECT g.id FROM _group_ g INNER JOIN student s on s.major = g.name order by s.id OFFSET 9 LIMIT 1));



--- bu 3 kodu student_teacher_group da foreign key kimi yazmisam ardicil olaraq studentin id esasen siralama olur
-- ilk yerde student majoruna yugun olana teachere gore id sonra
-- teacherde_id ucun bunun tersi  ve
-- qrupdada eyni formada studentin idesine uygun olaraq group adi olacaq
SELECT s.id  FROM student s
INNER JOIN teacher t on s.major = t.position ;

SELECT t.id  FROM student s
INNER JOIN teacher t on s.major = t.position ;

SELECT g.id FROM _group_ g
INNER JOIN student s on s.major = g.name order by s.id;



---Select join

SELECT * FROM student_teacher_group AAA          -----Umumi cedvelin joinle cap olunmasi
    INNER JOIN student s on s.id = AAA.student_id
    INNER JOIN student_row_info sri on sri.id = s.student_row_info_id
    INNER JOIN teacher t on t.id = AAA.teacher_id
    INNER JOIN teacher_row_info tri on tri.id = t.teacher_row_info_id
    INNER JOIN _group_ g on g.id = AAA.group_id
    INNER JOIN group_row_info gri on gri.id = g.group_row_info_id where tri.status=1 and sri.status=1;


UPDATE teacher_row_info SET status=1 WHERE id=(SELECT ID FROM teacher WHERE teacher.id = 2);
UPDATE teacher_row_info SET update_date = now() WHERE id=(SELECT ID FROM teacher WHERE teacher.id = 2);

