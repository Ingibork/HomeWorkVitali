package enums;

/**
 * Модифицировать энам Color, написанный на занятии,
 * так чтобы можно было передавать название в любом
 * регистре и находить нужный нам элемент энама.
 */
public enum Color {
    RED(4, "Красный"),
    YELLOW(3, "Желтый"),
    BLUE(2, "Синий"),
    ORANGE(1, "Оранжевый");

    private final int id;
    private final String rusName;

    Color(int id, String rusName){
        this.id = id;
        this.rusName = rusName;
    }

    public int getId() {
        return id;
    }

    public String getRusName() {
        return rusName;
    }

    public static Color valueOfIgnoreCase(String name) {
        return valueOf(name.toUpperCase());
    }



}