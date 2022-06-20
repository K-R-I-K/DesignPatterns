package Builder;

public enum HouseElements
{
    DOOR(100),
    WALL(60),
    WINDOW(50),
    FLOOR(300),
    CEILING(80);

    private int price;
    HouseElements(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}