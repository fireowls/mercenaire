package fr.fireowls.apigame.item.tool.hoe.hoes;

import fr.fireowls.apigame.item.*;
import fr.fireowls.apigame.item.tool.hoe.Hoe;
import fr.fireowls.apigame.item.tool.hoe.HoeType;

public class StoneHoe extends Hoe implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StoneHoe() {
        super(HoeType.STONEHOE, Rarity.COMMON,new ItemMeta("stoneHoe.json"));
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
        return 15;
    }
}
