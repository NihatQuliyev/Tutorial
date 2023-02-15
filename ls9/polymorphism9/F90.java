package polymorphism9;

public class F90 extends Bmw {
    public String details;

    public F90(String name, String oil, String details) {
        super(name, oil);
        this.details = details;
    }

    public String getInfo(){
        String str = "Name: " + name + "\nOil: " + oil + "\nDetails" + details;
        return str;
    }

}
