package fr.fireowls.apigame.item.tool.pickaxe.pickaxes;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.tool.pickaxe.Pickaxe;
import fr.fireowls.apigame.item.tool.pickaxe.PickaxeType;

public class StonePick extends Pickaxe implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StonePick() {
        super(Rarity.COMMON, PickaxeType.STONEPICK,new ItemMeta("stonePick.json"));
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
