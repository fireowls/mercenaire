package fr.fireowls.apigame.item.weapon.weapons.projectile.bolt.bolts;

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
    public boolean hasMaterial() {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 10;
    }
}
