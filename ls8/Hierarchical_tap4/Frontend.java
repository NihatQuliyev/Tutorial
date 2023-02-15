package Hierarchical_tap4;

public class Frontend extends Employee {
    String frontentdili;

    public Frontend(String name, String age, String frontentdili) {
        super(name, age);
        this.frontentdili = frontentdili;
    }

    @Override
    public String toString() {
        return "Frontend{" +
                "frontentdili='" + frontentdili + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
