package polymorphism9;

public class Bmw extends Car {
    public String oil;

    public Bmw(String name, String oil) {
        super(name);
        this.oil = oil;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getInfo(){
        String str = "Oil: " + oil + "\nName: " + name ;
        return str ;
    }
}
