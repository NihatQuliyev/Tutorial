package ls2;

import java.util.Scanner;

public class TernaryYas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yasini gir : ");
        int yas = input.nextInt();
        String g = yas>=18 ? "Gire bilersiniz" : "daxil ola bilmezsiniz " ;
        System.out.println(g);
        
    }
}
