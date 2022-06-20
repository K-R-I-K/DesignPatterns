package Builder;

public enum Material
{
    WOOD(1.15),
    STONE(1.25),
    SAND(1.05),
    GLASS(1.4);

    private double coefficient;
    Material(double coefficient){
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}