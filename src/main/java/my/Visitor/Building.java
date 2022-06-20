package Visitor;

public abstract class Building {
    private int price;
    private String name;
    Building(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract String visit(Visitor visitor);

    @Override
    public String toString() {
        return "Building{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
