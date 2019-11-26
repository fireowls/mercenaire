package fr.fireowls.apigame.item.equipment.armor.chestplate.chestplates;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.armor.chestplate.Chestplate;
import fr.fireowls.apigame.item.equipment.armor.chestplate.ChestplateType;

public class LeatherChestplate extends Chestplate implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherChestplate() {
        super(Rarity.COMMON, ChestplateType.LEATHERCHESTPLATE,new ItemMeta("leatherChestplate.json"));
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
