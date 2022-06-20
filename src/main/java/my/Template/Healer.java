package Template;

public class Healer extends Template
{
    private int healHP;

    public Healer(int dmg, int speed, int healHP) {
        super(dmg,speed);
        this.healHP = healHP;
    }

    @Override
    public void attack() {
        System.out.println("Healer attacks with " + this.getDmg() + " dmg");
    }

    @Override
    public void heal() {
        System.out.println("Healer heals with " + healHP + " HP");
    }

    @Override
    public void characterHP() {
        System.out.println("Healer has " + this.getHp() + "HP");
    }

    @Override
    public void move() {
        System.out.println("Healer moves with " + this.getSpeed() + " m/s");
    }
}