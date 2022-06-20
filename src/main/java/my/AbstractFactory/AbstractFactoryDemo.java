package AbstractFactory;

public class AbstractFactoryDemo
{
    public static void main(String[] args) {

        ProductInteraction productInteraction = ProductInteraction.getInstance();

        productInteraction.createFactory("AMD");
        productInteraction.createCPU();
        productInteraction.createVideoCard();
        productInteraction.createRAM();

        System.out.println();
        productInteraction.createFactory("Intel");
        productInteraction.createCPU();
        productInteraction.createVideoCard();
        productInteraction.createRAM();

        System.out.println();
        System.out.println(productInteraction.getCPU());
        System.out.println(productInteraction.getVideoCard());
        System.out.println(productInteraction.getRAM());
    }
}