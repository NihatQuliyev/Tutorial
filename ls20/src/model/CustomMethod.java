package model;

import java.lang.reflect.Method;

public class CustomMethod {


    static Method[]  methods = User.class.getDeclaredMethods();




    public CustomMethod(Method[] methods) {

        this.methods = methods;
    }

    @Override
    public String toString() {

        for (Method method:methods) {
            System.out.println( "Method name: " + method.getName() +
                                "\nMethod count: " + method.getParameterCount() +
                                "\nMethod type: " + method.getReturnType().getName() +
                                "\nAnnotations: " + method.getAnnotation(CustomAnnotations.class) +
                                "\n-----------------"
            );
        }
        return "";
    }
}
