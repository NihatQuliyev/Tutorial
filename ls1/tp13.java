package tapsiriqlar;

import java.util.Scanner;


public class tp13 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("1-ci eded: ");
        float reqem1 = input.nextInt();
        System.out.print("2-ci eded: ");
        float reqem2 = input.nextInt();
        System.out.println("Sum of two integers: "+(reqem1+reqem2));
        System.out.println("Difference of two integers: "+(reqem1-reqem2));
        System.out.println("Product of two integers: "+(reqem1*reqem2));
        System.out.println("Average of two integers:  "+(reqem1+reqem2)/2);
        System.out.println("Difference of two integers: " + Math.abs(reqem1-reqem2));     
        System.out.println("Max integer:  " + Math.max(reqem1,reqem2));
        System.out.println("Max integer:  " + Math.min(reqem1,reqem2));
            
    }
    
    
}

