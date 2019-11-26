package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class TigerSkin extends Material implements Sellable {

    public TigerSkin(int amount) {
        super(Rarity.LEGENDARY, MaterialType.TIGERSKIN, amount,new ItemMeta("tigerSkin.json"));
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
