package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class IronOre extends Material implements Sellable {

    public IronOre(int amount) {
        super(Rarity.COMMON, MaterialType.IRONORE, amount,new ItemMeta("ironOre.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 2;
    }
}
