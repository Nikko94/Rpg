package Weapon;

public class Bow extends Weapon {

    private int range;
    private int drawWeight;

    public Bow(String name, double weight, int goldValue, double baseDamage, double attackSpeed, int range,
            int drawWeight) {
        super(name, weight, goldValue, baseDamage, attackSpeed);
        this.range = range;
        this.drawWeight = drawWeight;
    }

    public int getRange() {
        return range;
    }

    public int getDrawWeight() {
        return drawWeight;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRange : " + getRange() + " meters"
                + "\nDraw Weight : " + getDrawWeight() + " kg";
    }
}
