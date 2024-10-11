package Armor;

import Interfaces.Equipable;
import Items.Item;
import Player.Inventory;

public abstract class Armor extends Item implements Equipable {
    private Material material;
    private int baseArmor;
    private int healthBuff;
    boolean isEquipped = false;

    public Armor(Material material, String name, double weight, int goldValue, int baseArmor, int healthBuff) {
        super(name, weight, goldValue);
        this.material = material;
        this.baseArmor = baseArmor;
        this.healthBuff = healthBuff;
    }

    public double getWeightInc() {
        return getWeight() * material.getWeightInc();
    }

    public double getGoldValueInc() {
        return getGoldValue() * material.getWeightInc();
    }

    public double getBaseArmor() {
        return baseArmor * material.getArmorInc();
    }

    public double getHealthBuff() {
        return healthBuff * material.getHealthInc();
    }


    public abstract void equip(Inventory inventory);

    public abstract void unequip(Inventory inventory);

    @Override
    public String toString() {
        return "Armor : " + getName()
                + "\nGold Value : " + getGoldValueInc()
                + "\nWeight : " + getWeightInc()
                + "\nMaterial : " + material
                + "\nBase Armor : " + getBaseArmor()
                + "\nHealth Buff : " + getHealthBuff();
    }
}
