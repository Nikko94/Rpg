package Armor;

import Player.Inventory;

public class Gloves extends Armor{
    public Gloves(Material material) {
        super(material, material + " Gloves " , 4, 10, 10, 20);
    }

    private static Gloves equippedGloves;

    @Override
    public void equip(Inventory inventory) {
        if (inventory.hasItem(this)) {
            if (equippedGloves == null) {
                equippedGloves = this;
                System.out.println("Equipped helmet: " + getName());
            } else if (equippedGloves == this) {
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
        if (equippedGloves != null) {
            System.out.println("Unequipped helmet: " + equippedGloves.getName());
            equippedGloves = null; // Reset the equipped helmet
        } else {
            System.out.println("No helmet is currently equipped.");
        }
    }
}
