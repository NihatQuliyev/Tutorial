package ls2 ;

import java.util.Scanner;

public class Sadekalkulyator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            int eded1;
            int eded2;
            int secim;
            System.out.println("Birinci reqem");
            eded1 = input.nextInt();
            System.out.println("Ikinci ededi daxil edin");
            eded2 = input.nextInt() ;


            System.out.println("\n Asagidakilardan birini sec");
            System.out.println("\n 1-Toplama \n 2-cixma \n 3-vurma \n 4- bolme");
            System.out.println("\n Seciminiz: ");

            secim = input.nextInt();

            if (secim == 1) {
                System.out.println("cemi:" + (eded1+eded2));

            }
            else if (secim == 2) {
                System.out.println("Ferqi" + (eded1-eded2));

            }
            else if (secim == 3){
                System.out.println("Vurma :" + (eded1*eded2));

            }


            else if (secim == 4){
                if (eded2==0){
                    System.out.println("0 bolme yoxdur");
                }
                else if(eded2 != 0){
                    System.out.println("Qismet" + (eded1 / eded2));
                    
                }

            }
        }
    }
        
}
    

