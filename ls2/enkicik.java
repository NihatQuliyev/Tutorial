package ls2 ;

import java.util.Scanner;

public class enkicik {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("first number: ");
        float first_number = input.nextFloat();
        System.out.println("Second number");
        float second_number = input.nextFloat();
        System.out.println("third number");
        float third_number = input.nextFloat();
        
        float a=Math.min(first_number,second_number);
        
        
        
        System.out.println("minimum : " + Math.min(a,third_number));
        
        
        
    }
}
        
        