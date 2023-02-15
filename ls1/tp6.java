package tapsiriqlar;

import java.util.Scanner;

public class tp6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("first number: ");
        int first_number = input.nextInt();
        System.out.print("second number: ");
        int second_number = input.nextInt();
        System.out.println(first_number + "+" + second_number + "=" + (first_number + second_number));
        System.out.println(first_number + "-" + second_number + "=" +(first_number - second_number)); 
        System.out.println(first_number + "*" + second_number + "=" +(first_number * second_number));
        System.out.println(first_number + "/" + second_number + "=" +(first_number / second_number));
        System.out.println(first_number + "%" + second_number + "=" +(first_number % second_number));
    }
    
}