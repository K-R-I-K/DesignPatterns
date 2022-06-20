package Flyweight;

public class TreeType {
    private String color;
    private Types types;

    public TreeType(String color, Types types) {
        this.color = color;
        this.types = types;
    }

    public String getColor() {
        return color;
    }

    public Types getTypes() {
        return types;
    }

    @Override
    public String toString() {
        return "{color='" + color + '\'' +
                ", types=" + types + '}';
    }
}
