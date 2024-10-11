package Armor;

public enum Material {
    Leather(0, 0, 0, 0),
    Iron(1.5, 2, 2.5, 2.5),
    Steel(2, 4, 4, 4);

    private final double weightInc;
    private final double valueInc;
    private final double armorInc;
    private final double healthInc;

    Material(double weightInc, double valueInc, double armorInc, double healthInc) {
        this.weightInc = weightInc;
        this.valueInc = valueInc;
        this.armorInc = armorInc;
        this.healthInc = healthInc;
    }

    public double getWeightInc() {
        return weightInc;
    }

    public double getValueInc() {
        return valueInc;
    }

    public double getArmorInc() {
        return armorInc;
    }

    public double getHealthInc() {
        return healthInc;
    }

}
