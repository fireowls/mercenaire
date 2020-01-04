package fr.fireowls.apigame.item.equipment.armor.boot.boots;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.boot.Boot;
import fr.fireowls.apigame.item.equipment.armor.boot.BootType;

public class IronBoot extends Boot implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronBoot() {
        super(Rarity.UNCOMMON, BootType.IRONBOOT,new ItemMeta("ironBoot.json"));
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
        return 20;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
