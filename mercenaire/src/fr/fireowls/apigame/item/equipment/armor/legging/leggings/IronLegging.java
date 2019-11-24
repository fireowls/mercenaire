package fr.fireowls.apigame.item.equipment.armor.legging.leggings;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.armor.legging.Legging;
import fr.fireowls.apigame.item.equipment.armor.legging.LeggingType;

public class IronLegging extends Legging implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronLegging() {
        super(Rarity.UNCOMMON, LeggingType.IRONLEGGING);
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
        return 20;
    }
}
