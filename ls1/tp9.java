package tapsiriqlar;

import java.util.Scanner;


public class tp9 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Input a value for inch: ");
        float number = input.nextInt();
        float h = 0.0254f;
        
        System.out.println(number + " inch is " + number*h);
    }
    
    
}