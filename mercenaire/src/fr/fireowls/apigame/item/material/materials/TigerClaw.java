package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class TigerClaw extends Material implements Sellable {

    public TigerClaw() {
        super(Rarity.LEGENDARY, MaterialType.TIGERCLAW,new ItemMeta("tigerClaw.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 10000;
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
