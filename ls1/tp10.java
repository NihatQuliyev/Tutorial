package tapsiriqlar;

import java.util.Scanner;


public class tp10 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();
        int a =number/100 ;
        int b =number/10%10;
        int c =number%10;
        
        System.out.println("The sum of all digits in " + a+b+c+ " is "+(a+b+c));
    }
    
    
}
