package single_tap1;

public class Notebook extends Kompyuter{
    String touchpad;

    public Notebook(String klavyatura, String maus, String manitor, String touchpad) {
        super(klavyatura, maus, manitor);
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "touchpad='" + touchpad + '\'' +
                ", klavyatura='" + klavyatura + '\'' +
                ", maus='" + maus + '\'' +
                ", manitor='" + manitor + '\'' +
                '}';
    }
}
