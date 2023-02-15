package localDate5;

import java.time.LocalDate;

public class LocalDateGet {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2003,10,3);
        System.out.println( "Day : "+ localDate.getDayOfMonth() +
                            "  Month: " + localDate.getMonthValue() + " --> " + localDate.getMonth()  +
                            " Years: " + localDate.getYear());
    }
}
