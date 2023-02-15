package tapsiriqlar;

import java.util.Scanner;


public class tp11 {


    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Input the number of minutes: ");
        int minutes = input.nextInt();
        
        int il = minutes/525600;  
        int day2 = minutes % 525600;
        int days3 = day2/1440;

        System.out.println(minutes + " minutes is approximately " + il + " years and " + days3 + " days"); 
        
        
    }
}
