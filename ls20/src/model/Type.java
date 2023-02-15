package model;

import java.util.ArrayList;
import java.util.List;

public class Type {

    public void method(){
        List<Object> objects = new ArrayList<>();
        objects.add(new CustomConstructor(CustomConstructor.constructors));
        objects.add(new CustomMethod(CustomMethod.methods));
        objects.add(new CustomFields(CustomFields.fields));

        for (Object object:objects) {
            System.out.println(object);

        }
    }

}
