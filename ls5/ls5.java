
import java.util.Arrays;

public class ls5 {

    static void tap1(){
        int[] array = new int[] {1,8,5};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.println(j);
        }
    }


    static void sual2() {
        int[][] array = {{9, 2, 3, 4}, {1, 8, 3, 4}, {1, 2, 7, 4}, {1, 2, 3, 6}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j)) {
                    count += array[i][j];

                }

            }


        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == (array.length - 1)) {
                    count += array[i][j];

                }
            }
        }

        System.out.println(count);
    }


    static void sual3(){
        int x = 5 ;
        int y = 7;
        x = x + y ;
        y = x - y ;
        x = x - y ;
        System.out.println(x);
        System.out.println(y);
    }

    static void sual4(){
        char a = 97 ;
        char b = 98 ;
        int eded1 = 5;
        int eded2 = 2 ;
        boolean deyisen = true;
        if(deyisen == true)
            for (int i = 0; i < eded1; i++) {
                System.out.println(a);
            }
        if(deyisen == false)
            for (int i = 0; i < eded2; i++) {
                System.out.println(b);
            }

    }
    static void sual6(){
        String t = "             1,e 6,e 0,e 9,e           ";
        String str = t.trim();
        String[] strAr = str.split(",e");

        for (int i = 0; i < strAr.length; i++) {
            Integer number =Integer.parseInt(strAr[i]);
            System.out.println(number*number);
            if(number==0){
                System.out.println("0 ededini kvadrata yukseltmek olmaz  ");

            }
            else{
                System.out.println(number*number);
            }
        }

    }

    static void sual7(){
        String str = "1,2,3,4,5,6,7,8,9";
        String[] newstr = str.split(",");
        for (int i = 0; i < newstr.length; i++) {
            System.out.print(    newstr[i] +   ", " );

        }


    }
    static void sual8(){
        char array[] = {'a', 'e', 'i', 'o', 'u'};

        char herf = 'i';

        int Index = Arrays.binarySearch(array, herf);

        System.out.println("" + "index: " + Index);
    }

    static void sual11(){
        String binary = "101001";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + " 2lik :  = " + decimal + "      10 luqda : ");
    }


    static void sual10(){
        int onluq = 157;
        String ikilik = Integer.toBinaryString( onluq);
        System.out.println(onluq + " 10lik :  = " + ikilik + "      2likde : ");
    }

    static void sual12(){
        int onluq = 157;
        String sekkizlik = Integer.toOctalString(onluq);
        System.out.println(onluq + " 10lik :  = " + sekkizlik + "      8likde : ");
    }
    static void sual13(){
        int onluq = 157;
        String onaltiliq = Integer.toHexString(onluq);
        System.out.println(onluq + " 10lik :  = " + onaltiliq + "      16 likda : ");
    }




    public static void main(String[] args) {
        //tap1();
        //sual2();
        //sual3();
        //sual4();
        //sual6();
        //sual7();
        //sual8();
        //sual11();
        //sual12();
        //sual13();


        //3 tapsiriq qaldi vaxt mehdudiyetine gore arasdira bilmedim :( 

    }

}
