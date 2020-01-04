package fr.fireowls.apigame.item.weapon.weapons.bow.bows;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
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
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
