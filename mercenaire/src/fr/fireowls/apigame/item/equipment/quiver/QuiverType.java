package fr.fireowls.apigame.item.equipment.quiver;

import fr.fireowls.apigame.item.equipment.quiver.quivers.SmallQuiver;

public enum QuiverType {
    SMALLQUIVER(SmallQuiver.class);

    private Class<? extends Quiver> c;

    private QuiverType(Class<? extends Quiver> c){
        this.c = c;
    }

    public Class<? extends Quiver> getQuiverClass() {
        return c;
    }
}
