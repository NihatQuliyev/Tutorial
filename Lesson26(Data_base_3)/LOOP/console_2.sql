CREATE TABLE X
(
    id SERIAL PRIMARY KEY ,
    odd int,
    even int
);

do $$
    DECLARE
        number int = 100;
        BEGIN
        FOR i in 1..number loop
            if i%2=0 then
                INSERT INTO x(even) VALUES (i);
            else
                INSERT INTO x(odd) VALUES (i);
            end if;
            end loop;
    end;
$$;



CREATE TABLE simple_digits
(
    id serial primary key ,
    simple_digits int
);

do $$
    DECLARE
        number int = 500;
        count int = 0;
        BEGIN
        FOR i in 2..number loop
            FOR j in 1..i loop
                if i%j=0 then
                    count = count + 1;
                end if;
                end loop;
            if count<=2 then
                INSERT INTO simple_digits(simple_digits) VALUES (i);
            end if;
            count = 0 ;
            end loop;
    end;
$$;


CREATE TABLE y
(
    number int ,
    odd int ,
    ten int ,
    hundred int
);

do $$
    DECLARE
        number1 int = 100;
        number2 int = 999;
        odd int;
        ten int;
        hundred int;
        BEGIN
        FOR i in number1..number2 loop
            odd = i%10;
            ten = i/10%10;
            hundred = i/100;
                INSERT INTO y(number, odd, ten, hundred) VALUES (i,odd,ten,hundred);
            end loop;
    end;
$$



