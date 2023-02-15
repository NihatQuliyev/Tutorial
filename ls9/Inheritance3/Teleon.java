package Inheritance3;

public class Teleon {
    private String name;
    private String adapts;

    public Teleon(String name, String adapts) {
        this.name = name;
        this.adapts = adapts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdapts() {
        return adapts;
    }

    public void setAdapts(String adapts) {
        this.adapts = adapts;
    }
}
