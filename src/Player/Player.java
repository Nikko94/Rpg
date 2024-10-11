package Player;

public class Player {
    private String name;
    private int health;
    private int mana;
    private int gold;

    public Player() {
        this.name = "Player";
        this.health = 1000;
        this.mana = 100;
        this.gold = 1000;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getGold() {
        return gold;
    }

    public boolean reduceGold(int amount) {
        if (gold >= amount) {
            gold -= amount;
            return true;
        } else {
            System.out.println("Not enough gold!");
            return false;
        }
    }
}
