package fr.fireowls.apigame.item.equipment.armor.shoulderpad.shoulderpads;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.shoulderpad.ShoulderPad;
import fr.fireowls.apigame.item.equipment.armor.shoulderpad.ShoulderPadType;

public class LeatherShoulderPad extends ShoulderPad implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherShoulderPad() {
        super(Rarity.COMMON, ShoulderPadType.LEATHERSHOULDERPAD,new ItemMeta("leatherShoulderpad.json"));
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
        return 15;
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
