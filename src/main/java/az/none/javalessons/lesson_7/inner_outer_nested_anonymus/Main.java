package az.none.javalessons.lesson_7.inner_outer_nested_anonymus;

public class Main {

    public static void main(String[] args) {

        InnerClazzExample.Person person = new InnerClazzExample.Person();

        Ability ability = new Person();
        ability.read();

        Ability ability1 = new Ability() {
            @Override
            public void read() {
                System.out.println("Not person is reading . it is just Main class");
            }
        };

        ability1.read();
    }
}
