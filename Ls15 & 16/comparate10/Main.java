package comparate10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nihat",19);
        User user2 = new User("Elchin",19);
        User user3 = new User("Təranə",29);
        User user4 = new User("Farid",20);

        List<User> list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        System.out.println(list + "\n                           ---------------------");

        Comparator comparator = new Comparator();

        Collections.sort(list,comparator);

        System.out.println(list + "\n                           ---------------------");

        Collections.sort(list,comparator.reversed());

        System.out.println(list + "\n                           ---------------------");

    }
}
