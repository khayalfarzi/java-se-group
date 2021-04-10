package az.none.javalessons.lesson_4;

public class EncapsulationExample {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Daxil etdiyiniz eded menfi oldugu ucun yash deyerine verile bilmez");
        else this.age = age;
    }
}
