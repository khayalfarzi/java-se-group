package az.none.javalessons.lesson_5;

import java.util.Objects;

public class Programmer extends Employee {

    private int bonus;

    public Programmer(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public Programmer(String name, String surname, String age, int salary, int bonus) {
        super(name, surname, age, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer)) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return bonus == that.bonus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "bonus=" + bonus +
                '}';
    }
}
