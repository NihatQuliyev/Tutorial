package ls3;


public class tap9 {
    public static void main(String[] args) {
        int[] array =  {10,20,20,30,30,50,60,60,40};
      
        for(int i = 0 ; i<array.length ; i++){
            for(int k = i+1 ;k<array.length;k++){
                if(array[i]==array[k]){

                   System.out.println(array[k]);
                }
                
                
            }
            
             
        }
                
    }
            
    
}
