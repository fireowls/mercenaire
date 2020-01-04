package fr.fireowls.apigame.item.tool.hoe.hoes;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
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
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 15;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
