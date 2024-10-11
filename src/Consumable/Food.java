package Consumable;

public class Food extends Consumable{

    private int hunger;

    public Food(String name, double weight, int goldValue, int hunger) {
        super(name, weight, goldValue);
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    @Override
    public String toString() {
        return "\n" + getName() 
        + "\nGold Value : " + getGoldValue()
        + "\nWeight : " + getWeight() 
        + "\nHunger : " + getHunger();
    }

}
