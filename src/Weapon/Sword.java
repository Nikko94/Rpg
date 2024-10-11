package Weapon;

public class Sword extends Weapon {
    private int bleed;
    private double duration;

    public Sword(String name, double weight, int goldValue, double baseDamage, double attackSpeed, int bleed,
            double duration) {
        super(name, weight, goldValue, baseDamage, attackSpeed);
        this.bleed = bleed;
        this.duration = duration;
    }

    public int getBleed() {
        return bleed;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBleed damage : " + getBleed()
                + "\nBleed Duration : " + getDuration();
    }

}
