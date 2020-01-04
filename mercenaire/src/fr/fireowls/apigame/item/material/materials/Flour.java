package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Flour extends Material implements Craftable, Sellable {

    public Flour(int amount) {
        super(Rarity.COMMON, MaterialType.FLOUR, amount,new ItemMeta("flour.json"));
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
        return 0;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }
}
