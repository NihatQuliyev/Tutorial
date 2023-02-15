package tapsiriqlar;

import java.util.Scanner;


public class tp8 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Input a degree in Fahrenheit: ");
        float number = input.nextInt();
        float h = 5/9f * (number - 32);
        
        System.out.println(number + " degree Fahrenheit is equal to " + h + "in Celsius");
    }
    
}   
