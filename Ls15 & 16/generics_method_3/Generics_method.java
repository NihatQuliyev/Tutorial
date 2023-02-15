package generics_method_3;

public class Generics_method<S> {

    public String name ;
    public String surname;

    public Generics_method (String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Generics_method() {
    }

    public  <T> void getName (T t , T a){
        System.out.println(t + " " + a);
    }

}
