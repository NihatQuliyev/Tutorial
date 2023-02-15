import com.sun.xml.internal.bind.v2.runtime.property.StructureLoaderBuilder;

public class Employee {
    String name;
    String surname;
    String age;
    String position;
    double salary;
    Skill  skill;

    public Employee(String name,String surname,String age ,String position,double salary,Skill skill)
    {
        this.name = name;
        this.surname =surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.skill = skill;
    }

    public void getInfo()
    {
        System.out.println( "Name: " + name  +
                 "\nSurname: " + surname +
                 "\nage: " + age +
                 "\nposition: " + position +
                 "\nsalary: " + salary +
                 "\nskill: " + this.skill.getInfo());

    }
    public String getname(String newName)
    {
        this.name = newName;

        return newName;
    }
    public String getsurname(String newSurname)
    {
        this.surname = newSurname;

        return newSurname;
    }
    public String getAge(String newage)
    {
        this.age = newage;

        return newage;
    }
    public String getPosition(String newPosition)
    {
        this.position = newPosition;

        return newPosition;
    }
    public int getSalary(int newSalary)
    {
        this.salary = newSalary;

        return newSalary;
    }
}
