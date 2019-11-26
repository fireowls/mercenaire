package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Stone extends Material implements Sellable {

    public Stone(int amount) {
        super(Rarity.COMMON, MaterialType.STONE, amount, new ItemMeta("stone.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 1 * super.amount;
    }
}
