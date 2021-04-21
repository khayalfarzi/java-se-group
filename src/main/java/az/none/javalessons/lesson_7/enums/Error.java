package az.none.javalessons.lesson_7.enums;

public enum Error {

    NOT_FOUND(404, "Axtardiginiz melumat tapilmadi"),
    UNAUTHORIZED(401, "Sisteme daxil olmaq ugursuz oldu"),
    INTERNAL(500, "Sistemde xeta bash verdi");

    private final int code;
    private final String description;

    Error(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
