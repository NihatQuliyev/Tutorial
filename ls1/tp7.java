package tapsiriqlar;

import java.util.Scanner;

public class tp7 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("reqem : ");
        int number = input.nextInt();
        int i = 1;
        while (i<=10) {
            int h = i*number;
            System.out.println(number + "*" + i + "=" +  h);
            i++;
        }
        
    }
    
}
