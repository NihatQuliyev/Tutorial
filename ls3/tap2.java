package ls3;

import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int dovrSayi = input.nextInt();
        for(int i = 0;i<dovrSayi;i++){
            System.out.println(str);
        }
    }
}
