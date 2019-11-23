package fr.fireowls.apigame.item.equipment.belt;

import fr.fireowls.apigame.item.equipment.belt.belts.LeatherBelt;

public enum BeltType {
    LEATHERBELT(LeatherBelt.class);

    private Class<? extends Belt> c;

    private BeltType(Class<? extends Belt> c){
        this.c = c;
    }

    public Class<? extends Belt> getBeltClass() {
        return c;
    }
}
