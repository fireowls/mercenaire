package fr.fireowls.apigame.item.equipment.armor.shoulderpad.shoulderpads;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
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
