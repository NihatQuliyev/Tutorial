package localTimeNow8;


import java.time.LocalDateTime;

public class now {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.withNano(0));
    }
}
