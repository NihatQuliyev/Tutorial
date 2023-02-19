package user;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Nihat",19),
                new User("Elchin",19),
                new User("Xadija",19),
                new User("Farid",20),
                new User("Ali" , 20),
                new User("Movlud",23));

        List<String> list = users.stream()
                .filter(user -> user.getName().length()>5)
                .map(user -> user.getName())
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
