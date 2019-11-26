package fr.fireowls.apigame.item.equipment.bag.bags;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
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
    public boolean hasMaterial() {
        return false;
    }
}
