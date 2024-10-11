package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Armor.*;
import Consumable.*;
import Items.Item;
import Player.Inventory;
import Player.Player;
import Weapon.*;

public class Shop {
    Scanner scanner = new Scanner(System.in);
    private List<ShopItem> shopItems;
    private Inventory inventory;
    private Player player;

    public Shop(Inventory inventory, Player player) {
        this.inventory = inventory;
        this.player = player;
        shopItems = new ArrayList<>();
        initializeItems();
    }

    public void listItems() {
        for (int i = 0; i < shopItems.size(); i++) {
            ShopItem shopItem = shopItems.get(i);
            Item item = shopItem.getItem();
            System.out.println((i + 1) + ". " + item.getName() + " | Cost: " + item.getGoldValue()
                    + " gold | Available: " + shopItem.getQuantity() + " pcs");

        }
    }

    public void searchForItem() {
        System.out.println("Enter the name of the item you are looking for:");

        String name = scanner.nextLine();

        boolean found = false;

        for (ShopItem shopItem : shopItems) {
            if (shopItem.getItem().getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Item found: " + shopItem.getItem().getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    public void buyItem() {
        listItems();
        System.out.println("Enter the number of the item you want to buy: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the amount you want: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Position the item where you want it.");
        int position = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= shopItems.size()) {
            ShopItem selectedShopItem = shopItems.get(choice - 1);

            int totalCost = selectedShopItem.getItem().getGoldValue() * amount;

            if (player.reduceGold(totalCost) && selectedShopItem.getQuantity() >= amount) {
                System.out.println("You have bought " + amount + " " + selectedShopItem.getItem().getName());
                selectedShopItem.setQuantity(selectedShopItem.getQuantity() + amount);
                inventory.addItem(position, selectedShopItem.getItem(), amount);

            } else {
                System.out.println("Item is out of stock");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }

    private void initializeItems() {
        // Add items to the shop
        // -----------------------------------------------------------------
        // Swords
        shopItems.add(new ShopItem(new ShortSword(), 10));
        shopItems.add(new ShopItem(new LongSword(), 10));
        shopItems.add(new ShopItem(new GreatSword(), 10));

        // -----------------------------------------------------------------
        // Bows
        shopItems.add(new ShopItem(new ShortBow(), 10));
        shopItems.add(new ShopItem(new LongBow(), 10));
        shopItems.add(new ShopItem(new CompoundBow(), 10));

        // -----------------------------------------------------------------
        // Axes
        shopItems.add(new ShopItem(new Hatchet(), 10));
        shopItems.add(new ShopItem(new WarAxe(), 10));
        shopItems.add(new ShopItem(new BattleAxe(), 10));

        // -----------------------------------------------------------------
        // Consumables
        shopItems.add(new ShopItem(new Milk(), 100));
        shopItems.add(new ShopItem(new Water(), 100));
        shopItems.add(new ShopItem(new Meat(), 100));
        shopItems.add(new ShopItem(new Bread(), 100));
        shopItems.add(new ShopItem(new HealthPotion(), 100));
        shopItems.add(new ShopItem(new ManaPotion(), 100));

        // -----------------------------------------------------------------
        // Armor
        shopItems.add(new ShopItem(new Helmet(Material.Leather), 10));
        shopItems.add(new ShopItem(new Helmet(Material.Iron), 10));
        shopItems.add(new ShopItem(new Helmet(Material.Steel), 10));

        shopItems.add(new ShopItem(new Chest(Material.Leather), 10));
        shopItems.add(new ShopItem(new Chest(Material.Iron), 10));
        shopItems.add(new ShopItem(new Chest(Material.Steel), 10));

        shopItems.add(new ShopItem(new Leg(Material.Leather), 10));
        shopItems.add(new ShopItem(new Leg(Material.Iron), 10));
        shopItems.add(new ShopItem(new Leg(Material.Steel), 10));

        shopItems.add(new ShopItem(new Boots(Material.Leather), 10));
        shopItems.add(new ShopItem(new Boots(Material.Iron), 10));
        shopItems.add(new ShopItem(new Boots(Material.Steel), 10));

        shopItems.add(new ShopItem(new Gloves(Material.Leather), 10));
        shopItems.add(new ShopItem(new Gloves(Material.Iron), 10));
        shopItems.add(new ShopItem(new Gloves(Material.Steel), 10));
    }

}
