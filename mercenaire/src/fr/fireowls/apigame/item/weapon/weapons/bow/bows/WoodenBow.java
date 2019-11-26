package fr.fireowls.apigame.item.weapon.weapons.bow.bows;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.bow.Bow;
import fr.fireowls.apigame.item.weapon.weapons.bow.BowType;

public class WoodenBow extends Bow implements Craftable, Sellable {

    /**
     * Constructeur d'arme
     */
    public WoodenBow() {
        super(Rarity.UNCOMMON, BowType.WOODENBOW, 10,new ItemMeta("woodenBow.json"));
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
