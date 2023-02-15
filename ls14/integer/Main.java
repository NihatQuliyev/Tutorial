package integer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate nextWeek  = localDate.plus(10,ChronoUnit.DAYS);
        System.out.println(nextWeek);

























    }
}
