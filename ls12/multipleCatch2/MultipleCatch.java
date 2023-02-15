package multipleCatch2;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int number = 8/0;
            int integer = Integer.parseInt("abc");
        }
        catch (IllegalArgumentException ex){
            System.out.println("sehvdir");
        }
        catch (ArithmeticException ex){
            System.out.println("False");

        }
    }
}
