package star9;

public class RectangleTriangle {
    public static void main(String[] args) {
        int line = 10;
        int column = 10;
        for (int i = 0; i < line /* column */ ; i++) {
            for (int j = 0; j < column /* line */; j++) {
                if (i+j+1>=column){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
/*
    *
   **
  ***
 ****

 */
