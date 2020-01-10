package fr.fireowls.apigame.item.equipment.armor.helmet.helmets;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.helmet.Helmet;
import fr.fireowls.apigame.item.equipment.armor.helmet.HelmetType;

public class LeatherHelmet extends Helmet implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherHelmet() {
        super(Rarity.COMMON, HelmetType.LEATHERHELMET,new ItemMeta("leatherHelmet.json"));
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
        return 0;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
