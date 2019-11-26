package fr.fireowls.apigame.item.weapon.weapons.projectile.arrow.arrows;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
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
    public boolean hasMaterial() {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 5;
    }
}
