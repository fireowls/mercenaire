package fr.fireowls.apigame.item.equipment.armor.helmet;

import fr.fireowls.apigame.item.equipment.armor.helmet.helmets.*;

public enum HelmetType {
    LEATHERHELMET(LeatherHelmet.class),
    IRONHELMET(IronHelmet.class);

    private Class<? extends Helmet> c;

    private HelmetType(Class<? extends Helmet> c){
        this.c = c;
    }

    public Class<? extends Helmet> getHelmetClass() {
        return c;
    }
}
