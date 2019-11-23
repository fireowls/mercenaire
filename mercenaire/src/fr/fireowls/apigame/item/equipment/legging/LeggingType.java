package fr.fireowls.apigame.item.equipment.legging;

import fr.fireowls.apigame.item.equipment.legging.leggings.LeatherLegging;

public enum LeggingType {
    LEATHERLEGGING(LeatherLegging.class);

    private Class<? extends Legging> c;

    private LeggingType(Class<? extends Legging> c){
        this.c = c;
    }

    public Class<? extends Legging> getLeggingClass() {
        return c;
    }
}
