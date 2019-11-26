package fr.fireowls.apigame.item.equipment.armor.helmet.helmets;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.armor.helmet.Helmet;
import fr.fireowls.apigame.item.equipment.armor.helmet.HelmetType;

public class IronHelmet extends Helmet implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronHelmet() {
        super(Rarity.UNCOMMON, HelmetType.IRONHELMET,new ItemMeta("ironHelmet.json"));
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
        return 0;
    }
}
