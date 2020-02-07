package fr.fireowls.apigame.item.equipment.jewlery;

import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.jewlery.necklace.Necklace;
import fr.fireowls.apigame.item.equipment.jewlery.ring.Ring;

public enum JewleryType {
    RING(Ring.class),
    NECKLACE(Necklace.class);

    private Class<? extends Jewlery> c;

    private JewleryType(Class<? extends Jewlery> c){
        this.c = c;
    }

    public Class<? extends Jewlery> getEquipClass() {
        return c;
    }
}
