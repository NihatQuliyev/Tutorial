package polymorphism9;

public class Car {
    public String name;


    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){
        String  str = "Name: " + name;
        return str ;
    }
}

