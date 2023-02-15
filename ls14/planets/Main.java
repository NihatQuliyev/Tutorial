package planets;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Planets.values().length; i++) {
            System.out.println("Planet name: "+ Planets.values()[i].name() + "\n" + Planets.values()[i]);
            System.out.println("\n<<<--------------------->>>");
        }

    }
}
