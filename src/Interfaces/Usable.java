package Interfaces;

import Player.Inventory;

public interface Usable {

    void use(Inventory inventory);
    void drink(Inventory inventory);
    void eat(Inventory inventory);

}
