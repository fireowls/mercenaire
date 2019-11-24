package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class TigerTooth extends Material implements Sellable {

    public TigerTooth(int amount) {
        super(Rarity.LEGENDARY, MaterialType.TIGERTOOTH, amount);
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
