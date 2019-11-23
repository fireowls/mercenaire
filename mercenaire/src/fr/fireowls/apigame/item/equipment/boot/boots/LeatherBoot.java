package fr.fireowls.apigame.item.equipment.boot.boots;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.boot.Boot;
import fr.fireowls.apigame.item.equipment.boot.BootType;

public class LeatherBoot extends Boot implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherBoot() {
        super(Rarity.COMMON, BootType.LEATHERBOOT);
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
