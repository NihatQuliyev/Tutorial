package generics_class1_2;

public class Main {
    public static void main(String[] args) {
        Generics <String> username = new Generics<>("Nihat Guliyev");
        System.out.println(username.getT());
    }
}