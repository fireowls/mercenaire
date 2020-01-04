package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class RawBeef extends Material implements Sellable {

    public RawBeef(int amount) {
        super(Rarity.COMMON, MaterialType.RAWBEEF, amount,new ItemMeta("rawBeef.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }

}