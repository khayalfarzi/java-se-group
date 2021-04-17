package az.none.javalessons.lesson_6.interface_demo;

public class Main {

    public static void main(String[] args) {
        Car car = new BMW();

        Vehicle vehicle = new Mercedes();

        Vehicle vehicle1 = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("Main");
            }
        };


        Car.stop();
    }
}
