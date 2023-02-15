package ls2;

import java.util.Scanner;


public class ededlerinCemi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EDED DAXIL EDIN : ");
        int i =input.nextInt();
        int j = i/10;
        int h = i%10;
        System.out.println(j+h);
    }
}