package accounts89101112;

public class Main {
    public static void main(String[] args) {
        MyProfil myProfil = new MyProfil();
        myProfil.name("Nihat");
        myProfil.surname("Quliyev");
        myProfil.years(19);
        //Polimorfizm
        Me me = new Me("Nihat","Quliyev","03.10.2003");
        me.years();
        Me facebook = new Facebook("Nihat","Quliyev","03.10.2003","nihat040");
        facebook.years();
        Me instagram = new Instagram("Nihat","Quliyev","03.10.2003","nihat040","nihatquliyev040@xxxxx.xxx");
        instagram.years();
    }
}
