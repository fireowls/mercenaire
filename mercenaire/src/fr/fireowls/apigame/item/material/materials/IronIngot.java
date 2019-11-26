package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class IronIngot extends Material implements Craftable, Sellable {

    public IronIngot(int amount) {
        super(Rarity.UNCOMMON, MaterialType.IRONINGOT, amount,new ItemMeta("ironIngot.json"));
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
        return 5;
    }
}
