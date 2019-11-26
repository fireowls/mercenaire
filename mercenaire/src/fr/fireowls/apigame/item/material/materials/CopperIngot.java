package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class CopperIngot extends Material implements Craftable, Sellable {

    public CopperIngot(int amount) {
        super(Rarity.UNCOMMON, MaterialType.COPPERINGOT, amount,new ItemMeta("copperIngot.json"));
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
        return 0;
    }
}
