package fr.fireowls.apigame.item.weapon.weapons.warhammer.warhammers;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.warhammer.WarHammer;
import fr.fireowls.apigame.item.weapon.weapons.warhammer.WarHammerType;

public class StoneWarHammer extends WarHammer implements Craftable, Sellable {
    /**
     * Constructeur d'arme
     */
    public StoneWarHammer() {
        super(Rarity.COMMON, WarHammerType.STONEWARHAMMER, 25,new ItemMeta("stoneHammer.json"));
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
        return 25;
    }
}
