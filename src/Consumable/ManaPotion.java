package Consumable;

public class ManaPotion extends Consumable{

    private int manaIncrease = 30;

    public ManaPotion() {
        super("Mana Potion", 0.1, 10);
    }

    public int getManaIncrease() {
        return manaIncrease;
    }

    public void use() {
        System.out.println("You drank the mana potion and gained " + getManaIncrease() + " mana.");
    }

    @Override
    public String toString() {
        return "Mana Potion : " + getManaIncrease();
    }
}
