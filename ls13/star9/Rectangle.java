package star9;

public class Rectangle {
    public static void main(String[] args) {
        int line = 10;
        int column = 10;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (i == 0 || i == line -1 || j==0 || j ==line - 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
/*
 *****
 *   *
 *   *
 *****

 */
