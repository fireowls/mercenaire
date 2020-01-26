package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Leather extends Material implements Sellable {

    public Leather() {
        super(Rarity.COMMON, MaterialType.LEATHER,new ItemMeta("leather.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 5;
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
