package Items;

abstract public class Item {
    private String name;
    private double weight;
    private int goldValue;

    public Item(String name, double weight, int goldValue) {
        this.name = name;
        this.weight = weight;
        this.goldValue = goldValue;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public String toString() {
        return name + "\n Weight : " + weight + " kg" 
        + "\n Value : " + goldValue + " gold";
    }


}
