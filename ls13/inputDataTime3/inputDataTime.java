package inputDataTime3;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inputDataTime {
    public static void main(String[] args) {
        System.out.print("Enter the Local Date(years,month,day) : ");
        String str1 =  new Scanner(System.in).nextLine();
        String[] str2 = str1.split(",");
        int years = Integer.parseInt(str2[0]);
        int month = Integer.parseInt(str2[1]);
        int day = Integer.parseInt(str2[2]);
        LocalDate localDate = LocalDate.of(years,month,day);
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println(localDate.format(dateTimeFormatter));
    }

}

