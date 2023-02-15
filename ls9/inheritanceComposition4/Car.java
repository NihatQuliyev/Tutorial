package inheritanceComposition4;

public class Car {
    String name;
    String years;
    String mator;
    Detallar detallar;

    public Car(String name, String years, String mator,Detallar detallar) {
        this.name = name;
        this.years = years;
        this.mator = mator;
        this.detallar = new Detallar(detallar.bmwMator, detallar.bmwTurbo);

    }
}
