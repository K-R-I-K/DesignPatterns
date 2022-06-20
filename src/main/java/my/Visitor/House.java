package Visitor;

public class House extends Building {

    House(String name, int price) {
        super(name, price);
    }

    @Override
    public String visit(Visitor visitor) {
        return visitor.visitHouse(this);
    }
}
