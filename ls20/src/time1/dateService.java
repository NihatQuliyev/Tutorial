package time1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class dateService {

        public  static void dataService(){
        Time time = new Time();
        Method[] methods =Time.class.getDeclaredMethods();

        for (Method method:methods) {
            TimeManage timeManage = method.getDeclaredAnnotation(TimeManage.class);
            if (timeManage != null) {
                try {
                    System.out.println(timeManage.value() + method.invoke(time));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    System.out.println(e.getMessage());
                }
            }

        }


    }
}