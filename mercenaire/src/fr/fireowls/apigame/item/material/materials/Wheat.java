package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Wheat extends Material implements Sellable {

    public Wheat(int amount) {
        super(Rarity.COMMON, MaterialType.WHEAT, amount,new ItemMeta("wheat.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
