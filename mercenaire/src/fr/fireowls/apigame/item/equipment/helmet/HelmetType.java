package fr.fireowls.apigame.item.equipment.helmet;

import fr.fireowls.apigame.item.equipment.helmet.helmets.LeatherHelmet;

public enum HelmetType {
    LEATHERHELMET(LeatherHelmet.class);

    private Class<? extends Helmet> c;

    private HelmetType(Class<? extends Helmet> c){
        this.c = c;
    }

    public Class<? extends Helmet> getHelmetClass() {
        return c;
    }
}
