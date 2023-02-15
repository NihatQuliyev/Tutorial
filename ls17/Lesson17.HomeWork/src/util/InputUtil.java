package util;

import java.util.Scanner;

public class InputUtil {
    public static byte byteInput(String  title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        byte input = scanner.nextByte();
        return input;
    }

    public static String stringInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String input = scanner.nextLine();
        return input;
    }
}
