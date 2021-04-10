package az.none.javalessons.lesson_4;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person();
//
//        Person person1 = new Person("Seymur");
//
//        Person.gender

        EncapsulationExample example = new EncapsulationExample();
        example.setAge(5);
        System.out.println(example.getAge());

        example.setAge(-88);
        System.out.println(example.getAge());
    }
}
