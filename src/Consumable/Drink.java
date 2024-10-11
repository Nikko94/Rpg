package Consumable;

public class Drink extends Consumable{
    private int thirst;

    public Drink(String name, double weight, int goldValue, int thirst) {
        super(name, weight, goldValue);
        this.thirst = thirst;
    }

    public int getThirst() {
        return thirst;
    }

    @Override
    public String toString() {
        return "\n" + getName() 
        + "\nGold Value : " + getGoldValue()
        + "\nWeight : " + getWeight() 
        + "\nHunger : " + getThirst();
    }
}
