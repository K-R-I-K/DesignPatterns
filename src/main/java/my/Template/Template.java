package Template;

// It is a behavioral design pattern that defines the backbone of
// an algorithm, shifting responsibility for some of its steps into subclasses.
// The pattern allows subclasses to redefine the steps of the algorithm
// without changing its overall structure.
//
// Facilitates code reuse, but you are strictly limited by the skeleton
// of the existing algorithm.

public abstract class Template
{
    private final int hp = 100;
    private int dmg;
    private int speed;

    Template(int dmg, int speed){
        this.dmg = dmg;
        this.speed = speed;
    }

    protected final int getHp() {
        return hp;
    }

    protected final int getDmg() {
        return dmg;
    }

    protected final int getSpeed() {
        return speed;
    }

    public abstract void attack();
    public abstract void heal();
    public abstract void move();
    public abstract void characterHP();
}