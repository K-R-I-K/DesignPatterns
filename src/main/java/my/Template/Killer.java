package Template;

public class Killer extends Template
{
    private int bonusDMG;

    Killer(int dmg, int speed, int bonusDMG){
        super(dmg,speed);
        this.bonusDMG = bonusDMG;
    }

    @Override
    public void attack() {
        System.out.println("Killer attacks with " + (this.getDmg()*bonusDMG) + " dmg");
    }

    @Override
    public void heal() {
        System.out.println("Killer has no healing");
    }

    @Override
    public void characterHP() {
        System.out.println("Killer has " + this.getHp() + "HP");
    }

    @Override
    public void move() {
        System.out.println("Killer moves with " + this.getSpeed() + " m/s");
    }
}