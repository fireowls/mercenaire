package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class Coal extends Material implements Sellable {

    public Coal(int amount) {
        super(Rarity.COMMON, MaterialType.COAL, amount);
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 1;
    }
}
