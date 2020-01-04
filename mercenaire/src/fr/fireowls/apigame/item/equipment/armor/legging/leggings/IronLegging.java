package fr.fireowls.apigame.item.equipment.armor.legging.leggings;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.legging.Legging;
import fr.fireowls.apigame.item.equipment.armor.legging.LeggingType;

public class IronLegging extends Legging implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronLegging() {
        super(Rarity.UNCOMMON, LeggingType.IRONLEGGING,new ItemMeta("ironLegging.json"));
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
    public double getPrice() {
        return 20;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
