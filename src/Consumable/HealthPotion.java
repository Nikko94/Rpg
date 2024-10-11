package Consumable;

public class HealthPotion extends Consumable{

    private int healthIncrease = 30;

    public HealthPotion() {
        super("Health Potion", 0.1, 10);
    }

    public int getHealthIncrease() {
        return healthIncrease;
    }

    public void use() {
        System.out.println("You drank the health potion and gained " + getHealthIncrease() + " health.");
    }

    @Override
    public String toString() {
        return "Health Potion : " + getHealthIncrease();
    }

}
