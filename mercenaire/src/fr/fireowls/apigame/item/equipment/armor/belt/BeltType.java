package fr.fireowls.apigame.item.equipment.armor.belt;

import fr.fireowls.apigame.item.equipment.armor.belt.belts.IronBelt;
import fr.fireowls.apigame.item.equipment.armor.belt.belts.LeatherBelt;

public enum BeltType {
    LEATHERBELT(LeatherBelt.class),
    IRONBELT(IronBelt.class);

    private Class<? extends Belt> c;

    private BeltType(Class<? extends Belt> c){
        this.c = c;
    }

    public Class<? extends Belt> getBeltClass() {
        return c;
    }
}
