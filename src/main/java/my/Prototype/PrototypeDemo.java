package Prototype;

public class PrototypeDemo
{
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2;

        rectangle1.setHeight(5);
        rectangle1.setWidth(5);
        System.out.println("Rectangle1 area = " + rectangle1.getArea());

        rectangle2 = (Rectangle) rectangle1.clone();
        System.out.println("Rectangle2 area = " + rectangle2.getArea());

        System.out.println("R1 equals R2 : " + rectangle1.equals(rectangle2));
    }
}