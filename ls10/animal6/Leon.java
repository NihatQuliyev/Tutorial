package animal6;
public class Leon extends Abstract {
    @Override
    void eat() {
        System.out.println("Animal meet");
    }

    @Override
    void tip() {
        super.tip();
    }
}