package fr.fireowls.apigame.item.equipment.armor.glove.gloves;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.armor.glove.Glove;
import fr.fireowls.apigame.item.equipment.armor.glove.GloveType;

public class IronGlove extends Glove implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronGlove() {
        super(Rarity.UNCOMMON, GloveType.IRONGLOVE,new ItemMeta("ironGlove.json"));
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
