package fr.fireowls.apigame.item.equipment.armor.chestplate.chestplates;

import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.chestplate.Chestplate;
import fr.fireowls.apigame.item.equipment.armor.chestplate.ChestplateType;

public class IronChestplate extends Chestplate implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronChestplate() {
        super(Rarity.UNCOMMON, ChestplateType.IRONCHESTPLATE,new ItemMeta("ironChestplate.json"));
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
