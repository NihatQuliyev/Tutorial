package tapsiriqlar;

import java.util.Scanner;


public class tp12 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("1-ci eded: ");
        int reqem = input.nextInt();
        int kvadrat = (int) Math.pow(reqem, 2);
        int kub = (int) Math.pow(reqem, 3);
        int dorduncudereceden = (int) Math.pow(reqem,4);
        System.out.println("Square: " + kvadrat);
        System.out.println("Cube: " + kub);
        System.out.println("Fourth power: " + dorduncudereceden );
        
        
         
        
    }
    
    
}