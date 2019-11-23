package fr.fireowls.apigame.item.equipment.helmet.helmets;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.helmet.Helmet;
import fr.fireowls.apigame.item.equipment.helmet.HelmetType;

public class LeatherHelmet extends Helmet implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherHelmet() {
        super(Rarity.COMMON, HelmetType.LEATHERHELMET);
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
