package az.none.javalessons.lesson_6.interface_demo;

public interface Car {

    static void stop() {
        System.out.println("Stop method");
    }

    void drive();

    default void start() {
        System.out.println("Start method");
    }
}