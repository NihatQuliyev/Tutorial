package model;

public class User {

    @CustomAnnotations
    String name;

    @CustomAnnotations
    int age;

    @CustomAnnotations
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @CustomAnnotations
    public User() {
    }
    @CustomAnnotations
    public String getName() {
        return name;
    }
    @CustomAnnotations
    public void setName(String name) {
        this.name = name;
    }
    @CustomAnnotations
    public int getAge() {
        return age;
    }
    @CustomAnnotations
    public void setAge(int age) {
        this.age = age;
    }
}
