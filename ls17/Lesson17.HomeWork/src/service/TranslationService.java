package service;
import model.Translation;

import static util.InputUtil.stringInput;

import java.util.HashMap;
import java.util.Map;

public class TranslationService {
    public static String az (){
        int correct = 0;
        int wrong = 0;
        Map<String,String> map = new HashMap<>();
        map.put("Window","Pencere");
        map.put("Door","Qapı");
        map.put("Bread","Çorek");
        map.put("Mouse","Sıcan");
        for (Map.Entry<String,String> mapn: map.entrySet()) {
            System.out.print(mapn.getKey() + " - ");
            if (stringInput("Az :").equalsIgnoreCase(mapn.getValue())){
                correct++;
                System.out.println("Correct");
            }
            else{
                wrong++;
                System.out.println("wrong , " +"Correct variant: " + mapn.getValue());
            }
        }
        System.out.println("Correct variant : " + correct);
        System.out.println("wrong variant : " + wrong);
        return null;
    }

    public static String en () {
        int correct = 0;
        int wrong = 0;
        Map<String, String> map = new HashMap<>();
        map.put("Window", "Pencere");
        map.put("Door", "Qapı");
        map.put("Bread", "Çorek");
        map.put("Mouse", "Sıcan");
        for (Map.Entry<String, String> mapn : map.entrySet()) {
            System.out.print(mapn.getValue() + " - ");
            if (stringInput("English: ").equalsIgnoreCase(mapn.getKey())) {
                correct++;
                System.out.println("Correct");
            } else {
                wrong++;
                System.out.println("wrong , " + "Correct variant: " + mapn.getKey());
            }
        }
        System.out.println("Correct variant : " + correct);
        System.out.println("wrong variant : " + wrong);
        return null;
    }
}