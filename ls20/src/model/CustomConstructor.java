package model;
import java.lang.reflect.Constructor;

public class CustomConstructor {


    static Package packages =User.class.getPackage();

    static Constructor[] constructors =User.class.getDeclaredConstructors();

    public CustomConstructor(Constructor[] constructors) {
        this.constructors = constructors;
    }

    @Override
    public String toString() {

        System.out.println("Package: " + packages.getName() );
        for (Constructor constructor:constructors) {
            System.out.println("\nClass name: " + constructor.getDeclaringClass().getName() +
                    "\nConstructor name: " + constructor.getName() +
                    "\nConstructor count: " + constructor.getParameterCount() +
                    "\nAnnotations: " + constructor.getAnnotation(CustomAnnotations.class) +
                    "\n-----------------"
            );
        }
        return "";
    }
}
