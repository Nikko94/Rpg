package Armor;

import Player.Inventory;

public class Leg extends Armor{
    public Leg(Material material) {
        super(material, material + " Legs", 10, 20, 20, 100);
    }

    private static Leg equippedLeg;

    @Override
    public void equip(Inventory inventory) {
        if (inventory.hasItem(this)) {
            if (equippedLeg == null) {
                equippedLeg = this;
                System.out.println("Equipped helmet: " + getName());
            } else if (equippedLeg == this) {
                System.out.println("You are already equipped with " + getName());
            } else {
                System.out.println("You already have a helmet equipped. Unequip it first.");
            }
        } else {
            System.out.println("You don't have " + getName() + " in your inventory.");
        }
    }

    @Override
    public void unequip(Inventory inventory) {
        if (equippedLeg != null) {
            System.out.println("Unequipped helmet: " + equippedLeg.getName());
            equippedLeg = null; // Reset the equipped helmet
        } else {
            System.out.println("No helmet is currently equipped.");
        }
    }
}
