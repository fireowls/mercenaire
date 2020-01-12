package fr.fireowls.apigame.item.weapon.weapons.battleaxe.battleaxes;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
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
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
