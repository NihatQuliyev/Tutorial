package printStackTrace;

public class PrintStackTrace {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int number = a/0;
        }
        catch (ArithmeticException e){

            System.out.println("ToString: " + e.toString());
            System.out.println("GetMessage: " + e.getMessage());
            System.out.print("PrintStackTrace: ");
            e.printStackTrace();
        }
    }
}
