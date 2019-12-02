package fr.fireowls.apigame.item.weapon.weapons.crossbow.crossbows;

import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.crossbow.Crossbow;
import fr.fireowls.apigame.item.weapon.weapons.crossbow.CrossbowType;

public class WoodenCrossbow extends Crossbow implements Craftable, Sellable {
    /**
     * Constructeur d'arme
     * @param damage est les dégâts causé par l'arme
     */
    public WoodenCrossbow(double damage) {
        super(Rarity.RARE, CrossbowType.WOODENCROSSBOW, damage,new ItemMeta("woodenCrossbow.json"));
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
