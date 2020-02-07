package fr.fireowls.apigame.item.equipment.purse.purses;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.purse.PurseItem;
import fr.fireowls.apigame.item.equipment.purse.PurseItemType;

public class PocketPurse extends PurseItem {
    /**
     * Constructeur d'item
     */
    public PocketPurse() {
        super(PurseItemType.POCKET, Rarity.COMMON, new ItemMeta("pocketPurse.json"), 10);
    }

    @Override
    public boolean hasMaterial(Inventory inv, int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getMarchandPrice() {
        return 0;
    }
}
