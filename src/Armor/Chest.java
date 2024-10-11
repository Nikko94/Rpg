package Armor;

import Player.Inventory;

public class Chest extends Armor{
    public Chest(Material material) {
        super(material, material + " Chest Armor", 15, 30, 30, 150);
    }

    private static Chest equippedChest;

    @Override
    public void equip(Inventory inventory) {
        if (inventory.hasItem(this)) {
            if (equippedChest == null) {
                equippedChest = this;
                System.out.println("Equipped helmet: " + getName());
            } else if (equippedChest == this) {
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
        if (equippedChest != null) {
            System.out.println("Unequipped helmet: " + equippedChest.getName());
            equippedChest = null; // Reset the equipped helmet
        } else {
            System.out.println("No helmet is currently equipped.");
        }
    }
}
