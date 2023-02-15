package Inheritance3;

public class Smartfon extends Teleon {

    private String screen ;

    public Smartfon(String name, String adapts, String screen) {
        super(name, adapts);
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getInfo(){
        return "Name: " + getName()
                +"\nAdapts: " + getAdapts()
                + "\nScreen: " + getScreen();
    }
}
