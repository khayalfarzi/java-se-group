package az.none.javalessons.lesson_5;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Employee employee = new Employee(4500);
        Programmer programmer = new Programmer(5000, 1500);
        Accountant accountant = new Accountant(5000);

//        if (programmer == person)
//            System.out.println("equals");
//
//        if (programmer == accountant)
//            System.out.println("is not equals");
    }
}
