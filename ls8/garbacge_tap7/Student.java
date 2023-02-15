package garbacge_tap7;

public class Student {
    String name ;
    String age;
     int id ;
     static int nextId = 0 ;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }
    public void showID(){
        System.out.println("Id: " + nextId);
    }

    public void finalize(){
        --nextId;
    }

}
