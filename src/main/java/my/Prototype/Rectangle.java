package Prototype;

public class Rectangle extends Shape
{
    private int area;

    public Rectangle() {}

    public Rectangle(Shape shape) {
        super(shape);
        if(shape != null) {
            this.area = shape.getWidth() * shape.getHeight();
        }
    }

    public int getArea() {
        if (this.getWidth() != 0 || this.getHeight() != 0 ) {
            return this.getHeight() * this.getWidth();
        } else {
            return 0;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public int hashCode() {
        return area;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Rectangle) obj).getWidth() == this.getWidth() && ((Rectangle) obj).getHeight() == this.getHeight();
    }
}