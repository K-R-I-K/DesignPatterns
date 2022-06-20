package Builder;

public class BuilderDemo
{
    public static void main(String[] args) {
        Director director = Director.getInstance();
        Builder builder = new SandBuilder();
        director.buildHouse("simple");

        director.setBuilder(builder);
        System.out.println("--------------------");
        director.buildHouse("middle");

        builder = new ModernBuilder();
        System.out.println("--------------------");
        director.setBuilder(builder);
        System.out.println("--------------------");
        director.buildHouse("complex");

        builder = new StoneBuilder();
        System.out.println("--------------------");
        director.setBuilder(builder);
        System.out.println("--------------------");
        director.buildHouse("simple");
    }
}