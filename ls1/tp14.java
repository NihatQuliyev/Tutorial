package tapsiriqlar;

import java.util.Scanner;


public class tp14 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Input six non-negative digits: ");
        int a = input.nextInt();
        int n1 = a / 100000 % 10;
        int n2 = a/ 10000 % 10;
        int n3 = a / 1000 % 10;
        int n4 = a / 100 % 10;
        int n5 = a / 10 % 10;
        int n6 = a % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
        
          
    }
    
    
}
