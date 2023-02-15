package marketSupermarket4;

public class Supermarket extends Abstrackt{
    @Override
    public void bread(int money) {
        System.out.println("baza qiymeti: " + money +
                "\nSupermarketqiymeti: " + money*2);
    }
}
