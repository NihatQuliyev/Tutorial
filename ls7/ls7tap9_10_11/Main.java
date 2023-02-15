package ls7tap9_10_11;

public class Main {
    public static void main(String[] args) {
        Customer Nihat = new Customer("Nihat", 1000);
        Customer Elchin = new Customer("Elchin", 1000);
        Nihat.tranfer(0.00001);
        Elchin.sender(0.00001);
        System.out.println(Nihat.getInfo());
        System.out.println(Elchin.getInfo());

        // Referans qirilmasi
        Customer Eli = new Customer("Eli",500);
        Eli = new Customer("Veli ",100);
        System.out.println(Eli.getInfo());
    }
}
