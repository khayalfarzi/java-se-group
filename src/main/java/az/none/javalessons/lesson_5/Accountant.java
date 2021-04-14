package az.none.javalessons.lesson_5;

public class Accountant extends Employee {

    public Accountant(int salary) {
        super(salary);
    }

    public Accountant(String name, String surname, String age, int salary) {
        super(name, surname, age, salary);
    }
}