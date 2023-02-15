package anonymus5;

public class Main  {
    public static void main(String[] args) {

        Abstrakt abstrakt = new Abstrakt() {
            @Override
            void sout() {
                System.out.println("Nihat");
            }
        };
        abstrakt.sout();

    }

}
