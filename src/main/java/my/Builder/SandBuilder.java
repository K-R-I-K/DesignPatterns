package Builder;

public class SandBuilder implements Builder
{
    @Override
    public double buildFloor(int count) {
        return count*HouseElements.FLOOR.getPrice()*Material.SAND.getCoefficient();
    }

    @Override
    public double buildCeiling() {
        return HouseElements.CEILING.getPrice()*Material.SAND.getCoefficient();
    }

    @Override
    public double buildWindow(int count) {
        return count*HouseElements.WINDOW.getPrice();
    }

    @Override
    public double buildDoor(int count) {
        return count*HouseElements.DOOR.getPrice()*Material.SAND.getCoefficient();
    }

    @Override
    public double buildWall(int count) {
        return count*HouseElements.WALL.getPrice()*Material.SAND.getCoefficient();
    }

    @Override
    public String toString() {
        return "Sand builder";
    }

    @Override
    public Material getMainMaterial() {
        return Material.SAND;
    }
}