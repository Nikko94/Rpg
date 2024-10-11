package Weapon;

public class Axe extends Weapon{
    private int knockBack;
    private int frequency;

    public Axe(String name, double weight, int goldValue, double baseDamage, double attackSpeed, int knockBack, int frequency) {
        super(name, weight, goldValue, baseDamage, attackSpeed);
        this.knockBack = knockBack;
        this.frequency = frequency;
    }

    public int getKnockBack() {
        return knockBack;
    }

    public int getFrequency() {
        return frequency;
    }
}
