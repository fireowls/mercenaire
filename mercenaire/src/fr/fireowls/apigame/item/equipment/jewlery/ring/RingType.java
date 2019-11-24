package fr.fireowls.apigame.item.equipment.jewlery.ring;

import fr.fireowls.apigame.item.equipment.jewlery.ring.rings.IronRing;

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
