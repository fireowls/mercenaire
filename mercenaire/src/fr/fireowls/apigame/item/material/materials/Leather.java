package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Leather extends Material implements Sellable {

    public Leather(int amount) {
        super(Rarity.COMMON, MaterialType.LEATHER, amount,new ItemMeta("leather.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 4;
    }
}
