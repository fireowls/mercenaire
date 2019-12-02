package fr.fireowls.apigame.item.equipment.armor.glove.gloves;

import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.glove.Glove;
import fr.fireowls.apigame.item.equipment.armor.glove.GloveType;

public class LeatherGlove extends Glove implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherGlove() {
        super(Rarity.COMMON, GloveType.LEATHERGLOVE,new ItemMeta("leatherGlove.json"));
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
