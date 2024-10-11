package Armor;

import Player.Inventory;

public class Helmet extends Armor {
    public Helmet(Material material) {
        super(material, material + " Helmet", 5, 13, 15, 50);
    }

    private static Helmet equippedHelmet;

    @Override
    public void equip(Inventory inventory) {
        if (inventory.hasItem(this)) {
            if (equippedHelmet == null) {
                equippedHelmet = this;
                System.out.println("Equipped helmet: " + getName());
            } else if (equippedHelmet == this) {
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
        if (equippedHelmet != null) {
            System.out.println("Unequipped helmet: " + equippedHelmet.getName());
            equippedHelmet = null; // Reset the equipped helmet
        } else {
            System.out.println("No helmet is currently equipped.");
        }
    }
}
