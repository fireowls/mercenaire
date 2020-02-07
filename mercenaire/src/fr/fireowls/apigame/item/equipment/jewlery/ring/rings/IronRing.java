package fr.fireowls.apigame.item.equipment.jewlery.ring.rings;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.jewlery.ring.Ring;
import fr.fireowls.apigame.item.equipment.jewlery.ring.RingType;

public class IronRing extends Ring implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronRing() {
        super(Rarity.UNCOMMON, RingType.IRONRING,new ItemMeta("ironRing.json"));
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getMarchandPrice() {
        return 0;
    }
}
