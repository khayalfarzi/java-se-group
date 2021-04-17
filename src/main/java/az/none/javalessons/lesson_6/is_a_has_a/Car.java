package az.none.javalessons.lesson_6.is_a_has_a;

import java.io.Serializable;

public class Car implements Serializable {
    private String wheel;
    private String glasses;

    public void drive(){
        System.out.println("Car drive");
    }
}