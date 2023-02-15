package Hierarchical_tap4;

public class Backend extends Employee{
    String Backend ;

    public Backend(String name, String age, String backend) {
        super(name, age);
        Backend = backend;
    }

    @Override
    public String toString() {
        return "Backend{" +
                "Backend='" + Backend + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
