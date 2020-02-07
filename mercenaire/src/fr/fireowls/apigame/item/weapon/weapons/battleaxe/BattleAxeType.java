package fr.fireowls.apigame.item.weapon.weapons.battleaxe;

import fr.fireowls.apigame.item.weapon.weapons.battleaxe.battleaxes.StoneBattleAxe;

public enum BattleAxeType {
    STONEBATTLEAXE(StoneBattleAxe.class);

    private Class<? extends BattleAxe> c;

    private BattleAxeType(Class<? extends BattleAxe> c){this.c = c;}

    public Class<? extends BattleAxe> getBattleAxeClass() {
        return c;
    }


}
