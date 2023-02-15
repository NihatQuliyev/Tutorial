public class Math {
    //TOPLAMA
    public String topla(int a ,int b)
    {
        return  "netice: " + (a+b);
    }
    //CIXMA
    public String cixma(int a ,int b)
    {
        return  "netice: " + (a-b);
    }
    //VURMA
    public String vur(int a ,int b)
    {
        return  "netice: " + (a*b);
    }
    //BOLME
    public String bolme(int a ,int b)
    {
        return  "netice: " + (a/b);
    }
    //ustluQuvet
    public int ustluQuvet(int n,int derece)
    {
        int netice = 1 ;
        for (int i = 0; i < derece; i++) {
            netice *= n;

        }
        return netice;
    }
    //factorial
    public  int factorial(int eded )
    {
        int netice = 1;
        for (int i = 1; i <= eded; i++) {
            netice *=i;

        }
        return netice;
    }
    // Qeyd : kokalti alqoritmin bilmedim ))




}




