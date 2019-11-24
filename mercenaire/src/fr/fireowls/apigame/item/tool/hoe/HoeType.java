package fr.fireowls.apigame.item.tool.hoe;

import fr.fireowls.apigame.item.tool.hoe.hoes.StoneHoe;

public enum HoeType {

    STONEHOE(StoneHoe.class);

    private Class<? extends Hoe> c;

    private HoeType(Class<? extends Hoe> c){this.c = c;}

    public Class<? extends Hoe> getHoeClass() {
        return c;
    }
}
