package fr.fireowls.apigame.item.equipment.glove;

import fr.fireowls.apigame.item.equipment.glove.gloves.LeatherGlove;

public enum GloveType {
    LEATHERGLOVE(LeatherGlove.class);

    private Class<? extends Glove> c;

    private GloveType(Class<? extends Glove> c){
        this.c = c;
    }

    public Class<? extends Glove> getGloveClass() {
        return c;
    }
}
