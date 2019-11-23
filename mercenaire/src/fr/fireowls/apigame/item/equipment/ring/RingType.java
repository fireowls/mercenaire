package fr.fireowls.apigame.item.equipment.ring;

import fr.fireowls.apigame.item.equipment.ring.rings.IronRing;

public enum RingType {
    IRONRING(IronRing.class);

    private Class<? extends Ring> c;

    private RingType(Class<? extends Ring> c){
        this.c = c;
    }

    public Class<? extends Ring> getRingClass() {
        return c;
    }
}
