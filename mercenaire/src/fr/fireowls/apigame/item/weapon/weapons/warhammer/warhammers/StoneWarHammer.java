package fr.fireowls.apigame.item.weapon.weapons.warhammer.warhammers;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.warhammer.WarHammer;
import fr.fireowls.apigame.item.weapon.weapons.warhammer.WarHammerType;

public class StoneWarHammer extends WarHammer implements Craftable, Sellable {
    /**
     * Constructeur d'arme
     */
    public StoneWarHammer() {
        super(Rarity.COMMON, WarHammerType.STONEWARHAMMER, 25,new ItemMeta("stoneWarHammer.json"));
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
        return 25;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
