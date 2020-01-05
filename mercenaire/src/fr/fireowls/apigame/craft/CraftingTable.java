package fr.fireowls.apigame.craft;

import java.util.List;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;

public abstract class CraftingTable {

    private CraftingTableType type;

    public CraftingTable(CraftingTableType type){
        this.type = type;
    }

    public abstract List<Item> getAllAvailableCraft(Inventory inv);
}
