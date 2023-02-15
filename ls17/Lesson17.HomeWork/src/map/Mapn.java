package map;

import java.util.*;

public class Mapn {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map2 = new LinkedHashMap<>();
        Map<Integer,String> map3 = new TreeMap<>();
        Map<Integer,String> map4 = new Hashtable<>(); // null deyer value qebul etmir
        map.put(1,null);
        map.put(5,"Elchin");
        map.put(3,"Xedice");
        map.put(4,"Leman");
        map.put(2,"Hesen");
        map.put(0,"Nurlan");
        map.entrySet(); // dovurde istiffade edirik ve hem key hemde value qaytarir
        map.keySet(); // key deyerini saxlayir
        map.values(); // ozunde deyer saxlayir
        System.out.println(map);
    }
}
