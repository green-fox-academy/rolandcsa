package Exercise10;

public class Fox {
    private final String name;
    private final String color;
    private final Integer age;

    public Fox(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }
}
