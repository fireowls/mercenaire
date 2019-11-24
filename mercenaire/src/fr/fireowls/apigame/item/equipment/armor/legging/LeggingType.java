package fr.fireowls.apigame.item.equipment.armor.legging;

import fr.fireowls.apigame.item.equipment.armor.legging.leggings.*;

public enum LeggingType {
    LEATHERLEGGING(LeatherLegging.class),
    IRONLEGGING(IronLegging.class);

    private Class<? extends Legging> c;

    private LeggingType(Class<? extends Legging> c){
        this.c = c;
    }

    public Class<? extends Legging> getLeggingClass() {
        return c;
    }
}
