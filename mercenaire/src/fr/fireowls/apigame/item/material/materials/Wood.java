package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Wood extends Material implements Sellable {

    public Wood(int amount) {
        super(Rarity.COMMON, MaterialType.WOOD, amount,new ItemMeta("wood.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 1 * super.amount;
    }
}
