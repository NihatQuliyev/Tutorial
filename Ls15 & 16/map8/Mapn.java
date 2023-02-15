package map8;

import java.util.HashMap;
import java.util.Map;

public class Mapn {
    public static void main(String[] args) {
        Map <Integer,String > map = new HashMap<>();
        map.put(1,"Nihat");
        map.put(2,"Elchin");
        map.put(3,"Təranə muellime ");
        map.put(4,"Farid muellim  ");

        for (Map.Entry map1 : map.entrySet()){
            System.out.println(map1.getKey() + " ---> " + map1.getValue());
        }
    }
}
