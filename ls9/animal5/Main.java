package animal5;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.voice();
        animal = new BabyDog(); 
        animal.voice();
        animal = new Ket();
        animal.voice();
    }
}
