package Hierarchical_tap4;

import org.omg.CORBA.BAD_CONTEXT;

public class Main {
    public static void main(String[] args) {
        Frontend frontend = new Frontend("Mirsaleh","19","Javascript");
        System.out.println(frontend);
        Backend backend = new Backend("Nihat","19","Java");
        System.out.println(backend);
    }

}
