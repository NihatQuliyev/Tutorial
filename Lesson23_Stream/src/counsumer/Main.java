package counsumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(123);
    }
}
