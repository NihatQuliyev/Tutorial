package util;
import static util.InputUtil.byteInput;
public class MenuUtil {
    public static byte entry(){
        System.out.println(
                        "[1]. Eat meat (10%) " + "\n" +
                        "[2]. Drink milk (8%)" + "\n" +
                        "[3]. Show energy"

        );

        return byteInput("Enter the option: ");

    }
}
