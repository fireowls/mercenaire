package fr.fireowls.apigame.item.weapon.weapons.projectile.bolt.bolts;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.projectile.bolt.Bolt;
import fr.fireowls.apigame.item.weapon.weapons.projectile.bolt.BoltType;

public class StoneBolt extends Bolt implements Craftable, Sellable {
    /**
     * Constructeur d'arme
     */
    public StoneBolt() {
        super(Rarity.UNCOMMON, BoltType.STONEBOLT, 10,new ItemMeta("stoneBolt.json"));
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
        return 5;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
