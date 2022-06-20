package Builder;

// You can go further and share the challenges of
// construction methods.
// in a separate class, called the "Director". In
// this option the director will set the order of
// the steps of construction
// and the builder is useful to them.
//
// A director is useful if you have several ways to
// design products that are removed by the order
// and available design steps.
// In this case, you can combine all this logic
// into one class.

public class Director
{
    private static Director director;
    private Builder builder;
    private double result;

    private Director(){}

    public static Director getInstance() {
        if (director == null){
            director = new Director();
        }
        return director;
    }

    public void setBuilder(Builder builder){
        if(builder != null){
            this.builder = builder;
            System.out.println(" -> " + builder + " is hired to do this work");
        }
    }

    public void buildHouse(String house){
        if(builder != null) {
            result = 0;
            System.out.println("Builder : " + builder);
            System.out.println("Main material : " + builder.getMainMaterial());
            result = switch (house) {
                case "simple" -> {
                    System.out.println("Simple house has : 1 door, 4 walls, 1 ceiling, 1 floor, 3 windows");
                    yield builder.buildFloor(1) + builder.buildCeiling() +
                            builder.buildDoor(1) + builder.buildWindow(3) +
                            builder.buildWall(4);
                } case "middle" -> {
                    System.out.println("Middle house has : 2 doors, 7 walls, 1 ceiling, 1 floor, 5 windows, 1 garage");
                    yield builder.buildFloor(1) + builder.buildCeiling() +
                            builder.buildDoor(2) + builder.buildWindow(5) +
                            builder.buildWall(7) + builder.buildGarage();
                } case "complex" -> {
                    System.out.println("Complex house has : 4 doors, 14 walls, 1 ceiling, 1 floor, 9 windows, 1 garage, 1 pool");
                    yield builder.buildFloor(2) + builder.buildCeiling() +
                            builder.buildDoor(2) + builder.buildWindow(9) +
                            builder.buildWall(14) + builder.buildGarage() +
                            builder.buildPool();
                }
                default -> {
                    System.out.println("Not correct variant of house");
                    yield 0;
                }
            };
            System.out.println("Total sum = " + result + "$");
        } else {
            System.out.println("No builder was hired :(");
        }
    }
}