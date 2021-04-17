package az.none.javalessons.lesson_6.abstraction;

import java.util.Objects;

public abstract class Human {

    private String eyes;

    private String hands;

    private String legs;

    public Human() {
    }

    public Human(String eyes, String hands, String legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    public abstract void abs();

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return eyes.equals(human.eyes) && hands.equals(human.hands) && legs.equals(human.legs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyes, hands, legs);
    }

    @Override
    public String toString() {
        return "Human{" +
                "eyes='" + eyes + '\'' +
                ", hands='" + hands + '\'' +
                ", legs='" + legs + '\'' +
                '}';
    }
}
