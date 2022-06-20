package Visitor;

public class Museum extends Building {

    Museum(String name, int price) {
        super(name, price);
    }

    @Override
    public String visit(Visitor visitor) {
        return visitor.visitMuseum(this);
    }
}
