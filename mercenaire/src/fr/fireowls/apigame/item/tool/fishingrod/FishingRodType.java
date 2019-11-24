package fr.fireowls.apigame.item.tool.fishingrod;

import fr.fireowls.apigame.item.tool.fishingrod.fishingrods.FishRod;

public enum FishingRodType {

    FISHROD(FishRod.class);

    private Class<? extends FishingRod> c;

    private FishingRodType(Class<? extends FishingRod> c){this.c = c;}

    public Class<? extends FishingRod> getFishingRodClass() {
        return c;
    }
}
