package Player;

import Items.Item;
import Shop.ShopItem;

public class Inventory {
    private int size;
    private Item[][] inventory;
    private String[][] slots;

    public Inventory(int size) {
        this.size = size;
        this.inventory = new Item[size][size];
        this.slots = new String[size][size];

        initilizeInventory();
    }

    private void initilizeInventory() {
        int counter = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                slots[i][j] = "(" + counter + ")";
                counter++;
            }
        }
    }

    public void printInventory() {
        int cellWidth = 30;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String content = slots[i][j];
                if (inventory[i][j] != null) {
                    content += " " + inventory[i][j].getName();
                }

                System.out.printf("%-" + cellWidth + "s", content);

                if (j < size - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("------------------------------");
                    if (j < size - 1)
                        System.out.print("+");
                }
                System.out.println();
            }
        }
    }

    public void addItem(int number, Item item, int amount) {
        int row = (number - 1) / size;
        int col = (number - 1) % size;

        if (row >= 0 && row < size && col >= 0 && col < size && amount > 0) {
            if (inventory[row][col] == null) {
                inventory[row][col] = item;

                ShopItem newShopItem = new ShopItem(item, amount);
                newShopItem.setQuantity(amount);
                System.out.println("Item added to inventory : " + item.getName());
            } else {
                System.out.println("Spot is taken: " + inventory[row][col]);
            }
        } else {
            System.out.println("Invalid position: " + number);
        }

    }

    public void removeItem(int number) {
        int row = (number - 1) / size;
        int col = (number - 1) % size;

        if (row >= 0 && row < size && col >= 0 && col < size) {
            if (inventory[row][col] != null) {
                inventory[row][col] = null;
                System.out.println("Removed item from inventory slot " + number);
            } else {
                System.out.println("Empty slot");
            }
        } else {
            System.out.println("Invalid position: " + number);
        }

    }

    public boolean hasItem(Item item) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (inventory[i][j] != null && inventory[i][j].equals(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isInventoryFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (inventory[i][j] == null) {
                    return false;
                }
            }
        }
        System.out.println("Inventory full!");
        return true;

    }

}

// 🍷, 🏹, ⚔