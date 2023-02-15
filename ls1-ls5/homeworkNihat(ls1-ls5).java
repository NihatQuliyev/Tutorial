
import  java.util.Arrays ;
import java.util.Scanner;

public class ls6QederQalanlar {


    // Write a Java program to test if an array contains a specific value.
    static void Empty(){
        int array[] = { } ;
        if ( array.length == 0) {
            System.out.println("empty");
        }
        else {
            System.out.println("Empty deil ");
        }
    }


    // Daxil edilmiş 2 ölçülü massivin sol diaqonal elementlərini tərsinə çevirən proqram tərtib edin.
    static void tersBawDiaqonal(){
        int[][] array = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4} } ;
        String ar = "" ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j ) {
                    ar =  array[i][j] + " " + ar ;
                }
            }
        }
        System.out.print("Ters formasi : " + ar );
    }


    //Daxil edilmiş 2 ölçülü massivin sağ diaqonal elementlərini tərsinə çevirən proqram tərtib edin.
    static void tersSagDiaqonal(){
        int[][] array = { {1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4} } ;
        String ar = "" ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array.length - 1 ) {
                    ar = array[i][j] + " " + ar ;

                }
            }
        }
        System.out.print(ar);

    }


    //Daxil edilən sətirdə hansı simvoldan neçə dəfə istifadə olunduğunu çap edən proqram yazın.
    static void simvollarinSayi(){
        Scanner input = new Scanner(System.in);
        System.out.print(" String daxil edin : ");
        String str = input.nextLine() ;
        char[] chars = str.toCharArray() ;
        String newStr = "" ;
        for (int i = 0; i < str.length(); i++) {
            int count =  1 ;
            for (int j = 0; j < str.length(); j++) {
                if (i != j  && chars[i] == chars[j] ){
                        count += 1 ;
                }
            }
            if (newStr.indexOf(chars[i]) < 0 ){
                newStr += chars[i]  + " - " +  count +  "\n";
            }
        }
        System.out.println(newStr);
    }
    // nece sait ve nece sait var
    static void saitSamit(){
        System.out.print("String elave et : ");
        String str = new Scanner(System.in).nextLine();
        String loverStr = str.toLowerCase();
        int sait = 0 ;
        int samit = 0 ;
        for (int i = 0; i < loverStr.length() ; i++) {
            if (loverStr.charAt(i) == 'a' || loverStr.charAt(i) == 'e' || loverStr.charAt(i) == 'i' || loverStr.charAt(i) == 'o' || loverStr.charAt(i) == 'u'
                    || loverStr.charAt(i) == 'ə' || loverStr.charAt(i) == 'ö'|| loverStr.charAt(i) == 'ü'|| loverStr.charAt(i) == 'ı'){
                sait++;
            } else if (loverStr.charAt(i)>='a' && loverStr.charAt(i)<='z') {
                samit++;
            }
        }
        System.out.println(" sait sayi : "  + sait);
        System.out.println(" samit sayi : " + samit );
    }

    //ulduzlu meselenin 3cusu
    static void ulduz3(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j>=5) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //ulduzlu meselenin 2cusu
    static void ulduz2(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //String str = “1,2,3,4,5,6,7,8,9”; gosterilmish setiri vergulden sonra boshluq qoyularaq chap edin. Yeni -> “1, 2, 3, 4, 5, 6, 7,8, 9”

    static void bosluqElaveEt1(){
        String str = "1,2,3,4,5,6,7,8,9";
        String newstr = "";
        for (int i = 0; i <str.length() ; i++) {
            newstr += str.charAt(i);
            if(i%2==1){
                newstr += " " ;
            }
        }
        System.out.print(newstr);

    }
    //2-ci metod
    static void bosluqElaveEt2(){
        String str = "1,2,3,4,5,6,7,8,9";
        String[] newstr =str.split(",");
            for (int i = 0; i <newstr.length  ; i++) {
                System.out.print(newstr[i]);
                for (int j = 0; j < newstr.length - 1; j++) {
                    if (i == j) {
                        System.out.print(", ");
                    }
                }
            }
    }

    static void binarySearch(){
        int[] array = {1,2,3,4,};
        System.out.print("index : " + Arrays.binarySearch(array,3));
    }

    /*	Demek, kichik bir axtarish sistemi quracayiq. String tipinde olan massivde bir chox adlar yer alsin. Ve daha sonra consoleda bizden input istenilsin. Meselen:
    String[] users = {“Abbas”, “Leman”, “Xedice”, “Ilyas”, “Nurlan”, “Nihat”, “Elchin”, “Murad”, “Mirhesen”, “Emin”, “Farid”, “Terane”}; - deye bir massivimiz var.
    Men consoledan ‘tera’ – daxil ederken proqram anlasin ki, men teraneni axtariram. Ve hemin adi tamamlayaraq yaninda indexide olmaqla chap etsin. Yox eger uygun gelen bir chox ad varsa hamisini  chap etsin. Eks halda ise bele bir user yoxdur desin */


    static void axaris() {
        System.out.print("str : ");
        String str = new Scanner(System.in).nextLine();
        String newstr = "";
        String[] users = {"Abbas", "Leman", "Xedice", "Ilyas", "Nurlan", "Nihat", "Elchin", "Murad", "Mirhesen", "Emin", "Farid", "Terane"};
        for (int i = 0; i < users.length; i++) {
            if (users[i].contains(str)) {
                newstr += users[i] + "- index: " + i + "\n";
            }

        }
        System.out.println(newstr);
        if (newstr.isEmpty()) {
            System.out.print("yoxdu");
        }
    }

    public static void main(String[] args) {
    axaris();
    }
}
