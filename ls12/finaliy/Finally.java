package finaliy;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.print("Misalin helli: ");
            int a = 10;
            int b = 0;
            int number = a/b;
            System.out.println(number);
            System.out.println("exceptiondan sora bura kecid bas vermir !");
        }
        catch (ArithmeticException ex){
            System.out.println("0 bolme yoxdur !");

        }
        finally {
            System.out.println("Error gozlentisi vardir ");

        }
    }
}
//Sual4
