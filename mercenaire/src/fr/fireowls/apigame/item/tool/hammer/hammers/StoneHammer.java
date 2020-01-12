package fr.fireowls.apigame.item.tool.hammer.hammers;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.tool.hammer.Hammer;
import fr.fireowls.apigame.item.tool.hammer.HammerType;

public class StoneHammer extends Hammer implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StoneHammer() {
        super(HammerType.STONEHAMMER, Rarity.COMMON,new ItemMeta("stoneHammer.json"));
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
    public int getPrice() {
        return 15;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
