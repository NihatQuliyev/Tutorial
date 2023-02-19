package supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> integer = () -> 5;

        System.out.println(integer.get());

    }
}
