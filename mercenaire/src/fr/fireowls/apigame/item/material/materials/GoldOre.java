package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class GoldOre extends Material implements Sellable {

    public GoldOre(int amount) {
        super(Rarity.COMMON, MaterialType.GOLDORE, amount,new ItemMeta("goldOre.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
