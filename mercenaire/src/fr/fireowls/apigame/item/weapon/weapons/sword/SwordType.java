package fr.fireowls.apigame.item.weapon.weapons.sword;

import fr.fireowls.apigame.item.weapon.weapons.sword.swords.StoneSword;

public enum SwordType {
    STONESWORD(StoneSword.class);

    protected Class<? extends Sword> c;

    private SwordType(Class<? extends Sword> c){this.c = c;}

    public Class<? extends Sword> getSwordClass() {
        return c;
    }
}
