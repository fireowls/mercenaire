package fr.fireowls.apigame.item.tool.shovel.shovels;

import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.tool.shovel.Shovel;
import fr.fireowls.apigame.item.tool.shovel.ShovelType;

public class StoneShovel extends Shovel implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StoneShovel() {
        super(ShovelType.STONESHOVEL, Rarity.COMMON,new ItemMeta("stoneShovel.json"));
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
