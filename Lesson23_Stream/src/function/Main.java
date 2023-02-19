package function;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> list = List.of(
                new User("Nihat","Male"),
                new User("Elchin","Male"),
                new User("Xadija","Female"),
                new User("Farid","Male"));


            list.stream()
                    .filter(a ->a.getGender().equals("Male"))
                    .map(user -> user.getName())
                    .forEach(System.out::println);

    }
}
