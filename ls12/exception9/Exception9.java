package exception9;


public class Exception9 {
    public static void main(String[] args) {
        try {
            String[] str = null;
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        }
        catch (NullPointerException e){
            System.out.println("Masiv bosdur");
        }
        try{
            int number = 10;
            for (int i = -10; i < number; i++) {

                System.out.println(100/i);
                //burda nece edimki o bolmeninin xetasin verdikden sora davamin getsin
            }
        }
        catch (ArithmeticException e){
            System.out.println("0 bolme yoxdur ");
        }
        try {
            int a = Integer.parseInt("abc7");
            System.out.println("true");

        }
        catch (Exception e){
            System.out.println("false");

        }
    }
}
