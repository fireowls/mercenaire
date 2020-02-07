package fr.fireowls.apigame.item.tool.hammer;

import fr.fireowls.apigame.item.tool.hammer.hammers.StoneHammer;

public enum HammerType {

    STONEHAMMER(StoneHammer.class);

    private Class<? extends Hammer> c;

    private HammerType(Class<? extends Hammer> c){this.c = c;}

    public Class<? extends Hammer> getHammerClass() {
        return c;
    }
}
