package tapsiriqlar;

import java.util.Scanner;

public class ls4 {
    //Sual1
    static void sual1() {
        Scanner input = new Scanner(System.in);
        System.out.print("eded : ");
        int eded = input.nextInt();
        for (int i = 1; i < eded; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void sual2() {
        Scanner input = new Scanner(System.in);
        System.out.print("eded : ");
        int eded = input.nextInt();
        for (int i = 1; i < eded; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    static void sual3() {
        Scanner input = new Scanner(System.in);
        System.out.print("eded : ");
        int eded = input.nextInt();
        int sum;
        for (sum = 0; eded != 0; ) {

            sum += eded % 10;
            eded /= 10;
        }
        System.out.println(sum);
    }

    static void sual4() {
        int[][] array = {{5, 11, 10}, {15, 41, 45}};
        int beseBolunen = 0;
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array[k].length; j++) {
                if (array[k][j] % 5 == 0) {
                    System.out.println(array[k][j]);
                }
            }
        }
    }

    //Sual 5
    static void sual5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk masiv daxildeki reqem sayin daxil et : ");
        int ilkMasivinDaxili = input.nextInt();
        System.out.print("ikinci masiv daxilindeki reqem sayin daxil et : ");
        int ikinciMasivinDaxili = input.nextInt();
        int[][] array = new int[ilkMasivinDaxili][ikinciMasivinDaxili];
        int c = 0;
        System.out.println("ilk masiv reqemleri daxil et : " + ilkMasivinDaxili + "  reqem");
        System.out.println("ilk masiv reqemleri daxil et : " + ikinciMasivinDaxili + "  reqem");
        for (int i = 0; i < ilkMasivinDaxili; i++) {
            for (int j = 0; j < ikinciMasivinDaxili; ) {
                array[i][j] = input.nextInt();
                ++j;
            }
        }
        for (int i = 0; i < ilkMasivinDaxili; i++) {
            for (int j = 0; j < ikinciMasivinDaxili; j++) {
                c += array[i][j];
            }
        }
        System.out.println(c);

    }

    static void sual6() {
        int[][] array = {{9, 2, 3, 4}, {1, 8, 3, 4}, {1, 2, 7, 4}, {1, 2, 3, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if ((i == j)) {   // matrislerde kordinatlari  sutun ve setir nomreleri eynidirse bir diametr uzerinde sayilir
                    System.out.print(array[i][j] + ",");
                }
            }
        }
    }

    static void sual7() {
        int[][] array = {{9, 2, 3, 4}, {1, 8, 3, 4}, {1, 2, 7, 4}, {1, 2, 3, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if ((i + j) == (array.length - 1)) {  // yazdiqda birinci sutun ve setir indexlerin toplayiriq sonra ise max index sayina beraber edirik sebebi :bu zaman setir sonundaki index gotrlecek ve sutun 1 olduqda setir 2 ,sutun 2 olduqda setir 2 olaraq davam edir :)
                    System.out.print(array[i][j] + ",");
                }
            }
        }
    }
    // ikinci for daxilinde j < array[i-1].length yazdigim ucun sonuncunu cap etmir ):
    static void sual8() {
        int[][] array = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < array[i-1].length; j++) {

                if ((i == j)) {
                    System.out.print(array[i][j] + ",");
                }
            }
        }
    }
    // 8 de yazdigim kimi
    static void sual9() {
        int[][] array = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < array[i-1].length; j++) {

                if ((i + j) == 3) {
                    System.out.print(array[i][j] + ",");
                }
            }
        }
    }
    static void sual10(){
        Scanner input = new Scanner(System.in);
        System.out.print(" eded : ");
        int eded = input.nextInt();
        int bolunenSayi = 0;
        for (int i = 1; i <= eded; i++) {

            if(eded%i == 0){
                ++bolunenSayi;
            }
        }
        if(eded==1){
            System.out.print("ne tek nede cut ededdir");

        }
        else if(bolunenSayi==2){
            System.out.print("sade ededir");
        }
        else {
            System.out.print("murekkeb ededdir");
        }
    }

    //elave
    static  void tersString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Cumle daxil edin : ");
        char [] cumle = input.nextLine().toCharArray();

        for (int i = cumle.length - 1; i >= 0  ; i--) {

            System.out.print( cumle[i]);
        }

    }
    static void sual11(){
        Scanner input = new Scanner(System.in);
        System.out.print("soz ve ya cumle daxil edin : ");
        String deyer = input.nextLine();
        String newdeyer = "";
        char ch;
        for (int i = 0; i < deyer.length(); i++) {
            ch = deyer.charAt(i);
            newdeyer = ch + newdeyer;
        }
        if(deyer.equals(newdeyer)) {
            System.out.println("Beraberdir");
        }
        else{
            System.out.println("beraber deil");
        }
        System.out.println(newdeyer);
    }
    static void sual12(){

    }

    public static void main(String[] args) {
        //sual1();
        //sual2();
        //sual3();
        //sual4();
        //sual5();
        //sual6();
        //sual7();
        //sual8();
        //sual9();
        //sual10();
        //tersString();
        //sual11();
    }
}
