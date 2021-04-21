package az.none.javalessons.lesson_7.inner_outer_nested_anonymus;

public class InnerClazzExample {

    protected enum Gender {
        MALE,
        FEMALE;
    }

    public static class Person {
        private String name;
        private String surname;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}