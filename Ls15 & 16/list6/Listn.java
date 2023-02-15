package list6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listn {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.remove(0);
        // System.out.println(arrayList);
        // arrayList.forEach(System.out::println);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
