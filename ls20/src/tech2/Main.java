package tech2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Tech tech = new Tech();

        Method[] methods = tech.getClass().getDeclaredMethods();

        for (Method method: methods) {
            OperationSystem operationSystem = method.getDeclaredAnnotation(OperationSystem.class);
            Phone phone = method.getDeclaredAnnotation(Phone.class);

            if(operationSystem != null){
                System.out.println("OS: " + method.getName());
                System.out.println(operationSystem);
            }


            else if (phone != null){
                System.out.println("Phone: " + method.getName());
                System.out.println(phone);

            }
        }
    }
}
