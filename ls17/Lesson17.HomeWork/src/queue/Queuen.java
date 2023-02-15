package queue;

import java.util.*;

public class Queuen {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(); // add olan ardiciliqda  qaytarir obyekdi
        Queue<Integer> queue3 = new ArrayDeque<>(); // add olan ardiciliqda qaytarir obyekdi
        Queue<Integer> queue = new PriorityQueue<>(); //daxil edilen obyektlerden en kiciyini basa qoyur gerisinin duzulusune fikir vermir
        queue.add(9);
        queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        //System.out.println(queue);

        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(0);
        //System.out.println(queue1); //daxil etdiyimiz sirada verir neticeni

        queue3.add(1);
        queue3.add(5);
        queue3.add(0);
        queue3.add(0);
        queue3.peek(); // ilk daxil olan obyekti qaytarir ama silmir !
        queue3.poll(); //ilk daxil olan obyekti qaytarir ve silir !
    }
}
