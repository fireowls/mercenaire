package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;

public class TigerClaw extends Material implements Sellable {

    public TigerClaw(int amount) {
        super(Rarity.LEGENDARY, MaterialType.TIGERCLAW, amount);
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 10000;
    }
}
