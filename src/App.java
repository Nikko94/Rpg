import Player.Inventory;
import Player.Player;

import java.util.Scanner;

import Shop.Shop;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("1. Open meny");
            System.out.println("2. Run test program");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            Inventory inventory = new Inventory(4);
            Player player = new Player();
            Shop shop = new Shop(inventory, player);

            switch (choice) {

                case 1:
                    boolean Menu = true;

                    while (Menu) {

                        System.out.println("1. Open inventory");
                        System.out.println("2. Shop");
                        System.out.println("3. Go back");

                        int choice2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (choice2) {
                            case 1:
                                inventory.printInventory();
                                break;
                            case 2:
                                boolean shopMenu = true;

                                while (shopMenu) {
                                    System.out.println("1. Search Item");
                                    System.out.println("2. Buy");
                                    System.out.println("3. Sell");
                                    System.out.println("4. Go back");

                                    int choice3 = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (choice3) {
                                        case 1:
                                            shop.searchForItem();

                                            break;
                                        case 2:
                                            shop.buyItem();
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            shopMenu = false;

                                    }
                                }
                                break;
                            case 3:
                                Menu = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    TestProgram testProgram = new TestProgram();
                    testProgram.runTest();
                    break;
                case 3:
                    running = false;
                    break;

            }
        }
        scanner.close();

    }
}
