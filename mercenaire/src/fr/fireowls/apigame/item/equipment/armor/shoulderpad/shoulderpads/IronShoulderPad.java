package fr.fireowls.apigame.item.equipment.armor.shoulderpad.shoulderpads;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.shoulderpad.ShoulderPad;
import fr.fireowls.apigame.item.equipment.armor.shoulderpad.ShoulderPadType;

public class IronShoulderPad extends ShoulderPad implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronShoulderPad() {
        super(Rarity.UNCOMMON, ShoulderPadType.IRONSHOULDERPAD,new ItemMeta("IronShoulderpad.json"));
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
