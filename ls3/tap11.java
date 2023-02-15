package ls3;

import java.util.Scanner;


public class tap11 {
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String str = "Quliyev Nihat";
        
        
        System.out.println("INDEX daxil et");
        
        int a = input.nextInt();
        
     

        char index1 = str.charAt(a);

        System.out.println( a + " indexin yerinde : " + index1 + " durur .");

    }
}            
    
