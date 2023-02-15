package ls3 ;

import java.util.Scanner;


public class tap6 {
    public static void main(String[] args) {
        int[] array = {50,60,70};
        Scanner input = new Scanner(System.in);
        System.out.println(" awagi reqem qeyd edin  ");
        int eded = input.nextInt();
        int index = -1;
        
        
        for (int i = 0 ; i < array.length;i++){
            if(array[i]==eded){
                index = i;
                break;
                
            }
        }
        
        System.out.println(index);
        
        
         
    }
}
