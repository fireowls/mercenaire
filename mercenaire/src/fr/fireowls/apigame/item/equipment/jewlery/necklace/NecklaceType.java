package fr.fireowls.apigame.item.equipment.jewlery.necklace;

import fr.fireowls.apigame.item.equipment.jewlery.necklace.necklaces.*;

public enum NecklaceType {
    IRONNECKLACE(IronNecklace.class);

    private Class<? extends Necklace> c;

    private NecklaceType(Class<? extends Necklace> c){
        this.c = c;
    }

    public Class<? extends Necklace> getNecklaceClass() {
        return c;
    }
}
