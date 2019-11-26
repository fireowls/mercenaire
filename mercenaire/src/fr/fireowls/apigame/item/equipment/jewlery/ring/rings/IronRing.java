package fr.fireowls.apigame.item.equipment.jewlery.ring.rings;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
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
    public boolean hasMaterial() {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 50;
    }
}
