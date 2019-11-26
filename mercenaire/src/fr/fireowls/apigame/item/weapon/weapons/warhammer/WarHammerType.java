package fr.fireowls.apigame.item.weapon.weapons.warhammer;

import fr.fireowls.apigame.item.weapon.weapons.warhammer.warhammers.StoneWarHammer;

public enum WarHammerType {
    STONEWARHAMMER(StoneWarHammer.class);

    private Class<? extends WarHammer> c;

    private WarHammerType(Class<? extends WarHammer> c){this.c = c;}

    public Class<? extends WarHammer> getWarHammerClass() {
        return c;
    }
}
