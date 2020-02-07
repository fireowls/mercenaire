package fr.fireowls.apigame.item.tool.axe;

import fr.fireowls.apigame.item.tool.axe.axes.StoneAxe;

public enum AxeType {
    STONEAXE(StoneAxe.class);

    private Class<? extends Axe> c;

    private AxeType(Class<? extends Axe> c){
        this.c = c;
    }

    public Class<? extends Axe> getAxeClass() {
        return c;
    }
}
