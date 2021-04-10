package az.none.javalessons.lesson_4;

public final class Person {

    public static String gender;
    public String name;
    protected String fatherName;
    int age;
    private String surname;

    public Person() {
        System.out.println("Default constructor called");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Name is : " + name);
    }

    public final void test() {
        System.out.println("Hello world");
    }
}