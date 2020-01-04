package fr.fireowls.apigame.item.weapon.weapons.projectile.arrow.arrows;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.projectile.arrow.Arrow;
import fr.fireowls.apigame.item.weapon.weapons.projectile.arrow.ArrowType;

public class StoneArrow extends Arrow implements Craftable, Sellable {
    /**
     * Constructeur d'arme
     */
    public StoneArrow() {
        super(Rarity.UNCOMMON, ArrowType.STONEARROW, 5,new ItemMeta("stoneArrow.json"));
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
        return 5;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
