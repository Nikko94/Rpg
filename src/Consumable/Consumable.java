package Consumable;
import Interfaces.Usable;
import Items.Item;
import Player.*;

public class Consumable extends Item implements Usable{

    public Consumable(String name, double weight, int goldValue) {
        super(name, weight, goldValue);

    }

    public void use(Inventory inventory){
        if(inventory.hasItem(this)) {
            System.out.println("You used a " + this.getName());
        } else {
            System.out.println("You don't have that item");
        }
    }
    
    public void drink(Inventory inventory) {
        if(inventory.hasItem(this)) {
            System.out.println("You've drunk " + this.getName());
        } else {
            System.out.println("You don't have that item");
        }
    }
    
    public void eat(Inventory inventory) {
        if(inventory.hasItem(this)) {
            System.out.println("You've eaten " + this.getName());
        } else {
            System.out.println("You don't have that item");
        }
    }
    
    
}
