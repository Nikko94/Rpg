import Player.Inventory;
import Player.Player;
import Shop.Shop;
import Consumable.*;
import Weapon.*;
import Armor.*;

public class TestProgram {
    Inventory inv;

    boolean runTest = true;

    public TestProgram() {
        inv = new Inventory(4);
        inv.printInventory();
        runTest();
    }

    public void runTest() {
        while (runTest) {
            testShop();
            testWeapons();
            testArmor();
            testConsumables();
            testInventory();
            runTest = false;
        }
    }

    private void testShop() {
        System.out.println("Test Shop\n");
        
        Player player = new Player();
        Shop shop = new Shop(inv, player);
        System.out.println();
        shop.buyItem();
        inv.printInventory();
        inv.removeItem(1);

        System.out.println();
    }

    private void testWeapons() {
        System.out.println("Test Weapon\n");

        Weapon shortSword = new ShortSword();
        Weapon longSword = new LongSword();
        Weapon greatSword = new GreatSword();

        inv.addItem(1, greatSword, 1);
        inv.addItem(8, longSword, 1);

        Weapon shortBow = new ShortBow();
        Weapon compoundBow = new CompoundBow();

        inv.addItem(5, compoundBow, 1);
        shortBow.attack();

        shortSword.equip(inv);
        shortSword.attack();
        compoundBow.equip(inv);
        shortSword.unequip(inv);
        compoundBow.equip(inv);
        compoundBow.attack();

        System.out.println();
    }

    private void testArmor() {
        System.out.println("Armor test\n");

        Armor chest = new Chest(Material.Iron);
        inv.addItem(15, chest, 1);
        System.out.println(chest.toString());

        chest.equip(inv);
        chest.equip(inv);
        chest.unequip(inv);
        chest.equip(inv);

        System.out.println();
    }

    private void testConsumables() {
        System.out.println("Consumable test\n");
        Consumable milk = new Milk();
        Consumable meat = new Meat();
        Consumable healthPotion = new HealthPotion();
        Consumable potion2 = new ManaPotion();

        inv.addItem(10, milk, 5);
        inv.addItem(13, meat, 2);

        healthPotion.use(inv);
        potion2.use(inv);
        meat.eat(inv);
        System.out.println();
    }

    private void testInventory() {
        System.out.println("Inventory test\n");
        inv.removeItem(5);
        System.out.println();
        inv.printInventory();

    }

}
