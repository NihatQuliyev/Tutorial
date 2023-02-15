package set7;

import java.util.HashSet;
import java.util.Set;

public class Setn {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(2);
        set.forEach(System.out::println);
    }

    // Listden ferqli olaraq dublikat elementleri cap elemir.

}
