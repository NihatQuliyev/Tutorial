package tryCatch1;

public class TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }
        catch (Exception ex){
            System.out.println("0 bolme yoxdur ");

        }
    }

}
