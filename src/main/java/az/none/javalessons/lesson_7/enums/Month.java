package az.none.javalessons.lesson_7.enums;

public enum Month {

    JANUARY("Yanvar ayi"),
    FEBRUARY("Fevral ayi"),
    MARCH("Mart ayi"),
    APRIL(" Aprel ayi"),
    MAY("May"),
    JUNE("Iyun"),
    JULY("Iyul"),
    AUGUST("Avqust"),
    SEPTEMBER("Sentyabr"),
    OCTOBER("Oktyabr"),
    NOVEMBER("Noyabtr"),
    DECEMBER("Dekabr");

    private final String value;

    Month(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
