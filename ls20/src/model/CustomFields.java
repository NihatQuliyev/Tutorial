package model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CustomFields {

    static Field[] fields = User.class.getDeclaredFields();

    public CustomFields(Field[] fields) {
        this.fields = fields;
    }

    public CustomFields() {
    }

    @Override
    public String toString() {
        for (Field field :fields) {
            System.out.println("Field name: " + field.getName() +
                    "\nField count: "+ field.getType() +
                    "\nAnnotations: " + field.getAnnotation(CustomAnnotations.class) +
                    "\n-----------------"
            );
        }
        return "";
    }
}
