package ls7tap8;

public class Lamp {

    boolean lamp;


    public void sondur() {
        if (lamp == false) {
            System.out.println("yanmir");
        }
    }
    public void yandir() {
        if (lamp == true) {
            System.out.println("yanir");
        }

    }
    public void deyis()
    {
        if (lamp==true){
            lamp=false;
            System.out.println("sondurdum");
        }
        else{
            lamp=true;
            System.out.println("yandirdim");
        }
    }

}

