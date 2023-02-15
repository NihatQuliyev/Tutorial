package ls3;


public class tap10 {
    public static void main(String[] args) {
        String[] array =  {"aa","bb","cc","aa","bb"};
      
        for(int i = 0 ; i<array.length ; i++){
            for(int k = i+1 ;k<array.length;k++){
                if(array[i]==array[k]){

                   System.out.println(array[k]);
                }
   
            }
   
        }
                
    }
            
    
}
