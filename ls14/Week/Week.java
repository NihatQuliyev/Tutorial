package Week;

public enum Week {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int number ;

    Week(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return
                "\nnumber: " + number;
    }
}
