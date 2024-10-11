package Weapon;

import Interfaces.Equipable;
import Items.Item;
import Player.Inventory;

public class Weapon extends Item implements Equipable {

    private static Weapon equippedWeapon = null;
    boolean isEquipped = false;
    private double baseDamage;
    private double attackSpeed;

    public Weapon(String name, double weight, int goldValue, double baseDamage, double attackSpeed) {
        super(name, weight, goldValue);
        this.baseDamage = baseDamage;
        this.attackSpeed = attackSpeed;
    }


    public double getBaseDamage() {
        return baseDamage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void attack() {
        if (isEquipped) {
            System.out.println("You attacked with your " + getName() + " for " + getBaseDamage()); 
        } else {
            System.out.println("You are not equipped with a weapon.");
        }
    }

    public void equip(Inventory inventory) {
        if(inventory.hasItem(this)) {
            if (equippedWeapon == null) {
                equippedWeapon = this;
                isEquipped = true;
                System.out.println("Equipped : " + getName());
            } else if (equippedWeapon == this){
                System.out.println("You are already equipped with " + getName());
            } else {
                System.out.println("You already have " + equippedWeapon.getName() + " equipped. Unequip it first.");  
            }
        } else {
            System.out.println("You don't have " + getName() + " in your inventory.");
        }
    }

    public void unequip(Inventory inventory) {
        if (inventory.hasItem(this)) {
            if (equippedWeapon == this) {
                equippedWeapon = null;
                isEquipped = false;
                System.out.println("Unequipped : " + getName());
            } else {
                System.out.println("No weapon to unequip");
            }
        } else {
            System.out.println("You don't have " + getName() + " in your inventory.");
        }
    }


    @Override
    public String toString() {
        return "\n" + getName() 
        + "\nGold Value : " + getGoldValue() 
        + "\nWeight : " + getWeight() 
        + "\nBase Damage : " + getBaseDamage() 
        + "\nAttack Speed : " + getAttackSpeed();
    }
}
