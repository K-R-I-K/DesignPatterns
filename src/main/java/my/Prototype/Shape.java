package Prototype;

public abstract class Shape
{
    private int height;
    private int width;

    public Shape() {}

    public Shape(Shape shape) {
        if (shape != null) {
            this.height = shape.height;
            this.width = shape.width;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract Shape clone();
}