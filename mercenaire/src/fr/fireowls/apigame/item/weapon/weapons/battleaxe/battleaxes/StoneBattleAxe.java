package fr.fireowls.apigame.item.weapon.weapons.battleaxe.battleaxes;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.weapon.weapons.battleaxe.BattleAxe;
import fr.fireowls.apigame.item.weapon.weapons.battleaxe.BattleAxeType;

public class StoneBattleAxe extends BattleAxe implements Craftable, Sellable {
    /**
     * Constructeur d'arme
     */
    public StoneBattleAxe() {
        super(Rarity.COMMON, BattleAxeType.STONEBATTLEAXE, 50,new ItemMeta("stoneBattleaxe.json"));
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
