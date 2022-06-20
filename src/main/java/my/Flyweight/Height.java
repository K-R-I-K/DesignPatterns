package Flyweight;

public enum Height {

    LOW(100),
    MIDDLE(300),
    HIGH(800);

    private int height;

    Height(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}