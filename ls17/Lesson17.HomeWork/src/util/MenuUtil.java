package util;

import static util.InputUtil.byteInput;

public class MenuUtil {
    public static byte entryApp() {
        System.out.println("------model.Translation------\n" +
                "1. Azerbaijan to English\n" +
                "2. English to Azerbaijan\n" +
                "3. Exit \n");
        return byteInput("Option: ");
    }
}

