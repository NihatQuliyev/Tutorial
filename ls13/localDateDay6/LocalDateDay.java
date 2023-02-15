package localDateDay6;

import java.time.LocalDate;

public class LocalDateDay {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2003,10,3);
        System.out.println(localDate.getDayOfYear());
    }
}
