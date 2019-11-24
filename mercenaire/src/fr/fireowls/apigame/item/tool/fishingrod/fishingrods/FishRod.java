package fr.fireowls.apigame.item.tool.fishingrod.fishingrods;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.tool.fishingrod.FishingRod;
import fr.fireowls.apigame.item.tool.fishingrod.FishingRodType;

public class FishRod extends FishingRod implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public FishRod() {
        super(FishingRodType.FISHROD, Rarity.COMMON);
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial() {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 10;
    }
}
