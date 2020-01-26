package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class TigerTooth extends Material implements Sellable {

    public TigerTooth() {
        super(Rarity.LEGENDARY, MaterialType.TIGERTOOTH,new ItemMeta("tigerTooth.json"));
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

    @Override
    public int getMarchandPrice() {
        return 0;
    }
}
