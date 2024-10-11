package Armor;

import Player.Inventory;

public class Boots extends Armor {
    public Boots(Material material) {
        super(material, material + " Boots", 8, 15, 15, 50);
    }

    private static Boots equippedBoots;

    @Override
    public void equip(Inventory inventory) {
        if (inventory.hasItem(this)) {
            if (equippedBoots == null) {
                equippedBoots = this;
                System.out.println("Equipped helmet: " + getName());
            } else if (equippedBoots == this) {
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
        if (equippedBoots != null) {
            System.out.println("Unequipped helmet: " + equippedBoots.getName());
            equippedBoots = null; // Reset the equipped helmet
        } else {
            System.out.println("No helmet is currently equipped.");
        }
    }
}
