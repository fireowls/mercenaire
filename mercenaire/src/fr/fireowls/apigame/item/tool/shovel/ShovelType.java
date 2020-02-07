package fr.fireowls.apigame.item.tool.shovel;

import fr.fireowls.apigame.item.tool.axe.Axe;
import fr.fireowls.apigame.item.tool.shovel.shovels.StoneShovel;

public enum ShovelType {
    STONESHOVEL(StoneShovel .class);

    private Class<? extends Shovel> c;

    private ShovelType(Class<? extends Shovel> c){
        this.c = c;
    }

    public Class<? extends Shovel> getShovelClass() {
        return c;
    }
}
