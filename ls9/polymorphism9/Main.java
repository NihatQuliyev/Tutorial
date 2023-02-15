package polymorphism9;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("M3");
        System.out.println(car.getInfo());
        Car car1 = new Bmw("M4", "92");
        System.out.println(car1.getInfo());
        Car car2 = new F90("M5" , "92" , "Turbo");
        System.out.println(car2.getInfo());
    }
}
