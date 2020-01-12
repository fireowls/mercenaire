package fr.fireowls.apigame.item.equipment.bag.bags;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.bag.Bag;
import fr.fireowls.apigame.item.equipment.bag.BagType;

public class SmallBag extends Bag implements Craftable {
    /**
     * Constructeur d'item
     */
    public SmallBag() {
        super(Rarity.COMMON, BagType.SMALLBAG,10,new ItemMeta("smallBag.json"));
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
