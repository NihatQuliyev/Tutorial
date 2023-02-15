package marketSupermarket4;

public class Market extends Abstrackt{


    @Override
    public void bread(int money) {
        System.out.println("baza qiymeti: " + money +
                "\nmarketqiymeti: " + money*1.5);
    }
}
