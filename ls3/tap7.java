package ls3 ;




public class tap7 {
    public static void main(String[] args) {
        int[] array = {100,-5,300};

        int maxeded = array[0];
        int mineded = array[0];
        
        
        for (int i = 0 ; i < array.length;i++){
            if(array[i]>maxeded){
                maxeded = array[i];
                
                
            }
            if (array[i]<mineded){
                mineded = array[i];
            }
        }
        
        System.out.println("Max eded : "+ maxeded);
        System.out.println("Min eded : "+ mineded);
        
        
         
    }
}
