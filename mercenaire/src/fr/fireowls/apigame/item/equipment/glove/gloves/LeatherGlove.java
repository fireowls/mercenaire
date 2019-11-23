package fr.fireowls.apigame.item.equipment.glove.gloves;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.glove.Glove;
import fr.fireowls.apigame.item.equipment.glove.GloveType;

public class LeatherGlove extends Glove implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherGlove() {
        super(Rarity.COMMON, GloveType.LEATHERGLOVE);
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
        return 20;
    }
}
