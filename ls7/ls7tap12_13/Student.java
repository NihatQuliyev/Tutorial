package ls7tap12_13;

public class Student {
    String name;
    String surname;
    String age;
    String not;

    public Student(String name, String surname, String age, String not)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.not = not;
    }

    public Student()
    {

    }

    public String nameDeyis (String name)
    {
        this.name = name;
        return name;
    }

    public String surnameDeyis (String surname)
    {
        this.name = surname;
        return surname;
    }
    public String ageDeyis (String age)
    {
        this.name = age;
        return age;
    }
    public String noteDeyis (String not)
    {
        this.name = not;
        return not;
    }


    public String getInfo(){
        return "name: " +name + "\nsurname: " + surname + "\nage" + age + "\nnot: " + not;
    }


}
