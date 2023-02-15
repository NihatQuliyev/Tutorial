package Week;

import folder1.*;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < Week.values().length; i++) {
            System.out.print("index: "  + Week.values()[i].ordinal()  + Week.values()[i]);
            System.out.println();
            System.out.println("name: " + Week.values()[i].name());
            System.out.println("     -----    ");
        }


    }




}