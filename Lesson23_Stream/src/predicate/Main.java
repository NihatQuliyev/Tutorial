package predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> print = (x -> x.equals("abc"));
        System.out.println(print.print("abc"));

    }
}
