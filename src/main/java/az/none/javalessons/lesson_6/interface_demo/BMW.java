package az.none.javalessons.lesson_6.interface_demo;

public class BMW implements Car, Vehicle{

    @Override
    public void drive() {
        System.out.println("BMW");
    }
}