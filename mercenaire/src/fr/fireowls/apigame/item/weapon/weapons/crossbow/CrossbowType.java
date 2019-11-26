package fr.fireowls.apigame.item.weapon.weapons.crossbow;

import fr.fireowls.apigame.item.weapon.weapons.crossbow.crossbows.WoodenCrossbow;

public enum CrossbowType {
    WOODENCROSSBOW(WoodenCrossbow.class);

    private Class<? extends Crossbow> c;

    private CrossbowType(Class<? extends Crossbow> c){this.c = c;}

    public Class<? extends Crossbow> getCrossbowClass() {
        return c;
    }
}
