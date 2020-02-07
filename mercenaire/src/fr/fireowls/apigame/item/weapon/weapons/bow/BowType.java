package fr.fireowls.apigame.item.weapon.weapons.bow;

import fr.fireowls.apigame.item.weapon.weapons.bow.bows.WoodenBow;

public enum BowType {
    WOODENBOW(WoodenBow.class);

    private Class<? extends Bow> c;

    private BowType(Class<? extends Bow> c){this.c = c;}

    public Class<? extends Bow> getBowClass() {
        return c;
    }
}
