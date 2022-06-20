package Builder;

public class StoneBuilder implements Builder
{
    @Override
    public double buildFloor(int count) {
        return count*HouseElements.FLOOR.getPrice()*Material.STONE.getCoefficient();
    }

    @Override
    public double buildCeiling() {
        return HouseElements.CEILING.getPrice()*Material.STONE.getCoefficient();
    }

    @Override
    public double buildWindow(int count) {
        return count*HouseElements.WINDOW.getPrice()*Material.GLASS.getCoefficient();
    }

    @Override
    public double buildDoor(int count) {
        return count*HouseElements.DOOR.getPrice()*Material.STONE.getCoefficient();
    }

    @Override
    public double buildWall(int count) {
        return count*HouseElements.WALL.getPrice()*Material.STONE.getCoefficient();
    }

    @Override
    public String toString() {
        return "Stone builder";
    }

    @Override
    public Material getMainMaterial() {
        return Material.STONE;
    }
}