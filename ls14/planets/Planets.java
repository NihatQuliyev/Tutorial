package planets;
public enum Planets {
    EARTH("23h 56m 4,1s","150 millon km","510 072 000 km²"),
    MERCURY("58d 15h 30m","58 million km","74.8 million km²"),
    VENERA("224,7","108 million km","460 200 000 km²"),
    MARS("24h 37m","228 million km","144.800.000 km²"),
    JUPITER("10h","778 million km","6.142E10 km²"),
    SATURN("10h 33m 38s","1.434E9 km","4.27E10 km²"),
    URANUS("17h","2.871E9 km","8,083E9 km²"),
    NEPTUNE("16h","4,495E9 km","7,618E9 km²");

    String lengthOfDay;
    String distanceFromSun;
    String area;

    Planets(String lengthOfDay, String distanceFromSun, String area) {
        this.lengthOfDay = lengthOfDay;
        this.distanceFromSun = distanceFromSun;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Length of day: " + this.lengthOfDay +
                "\nDistance from sun: " + this.distanceFromSun +
                "\nArea: " + this.area;
    }
}