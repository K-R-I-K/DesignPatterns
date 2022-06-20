package Builder;

public class WoodBuilder implements Builder
{
    @Override
    public double buildFloor(int count) {
        return count*HouseElements.FLOOR.getPrice()*Material.WOOD.getCoefficient();
    }

    @Override
    public double buildCeiling() {
        return HouseElements.CEILING.getPrice()*Material.WOOD.getCoefficient();
    }

    @Override
    public double buildWindow(int count) {
        return count*HouseElements.WINDOW.getPrice()*Material.GLASS.getCoefficient();
    }

    @Override
    public double buildDoor(int count) {
        return count*HouseElements.DOOR.getPrice()*Material.WOOD.getCoefficient();
    }

    @Override
    public double buildWall(int count) {
        return count*HouseElements.WALL.getPrice()*Material.WOOD.getCoefficient();
    }

    @Override
    public String toString() {
        return "Wood builder";
    }

    @Override
    public Material getMainMaterial() {
        return Material.WOOD;
    }
}