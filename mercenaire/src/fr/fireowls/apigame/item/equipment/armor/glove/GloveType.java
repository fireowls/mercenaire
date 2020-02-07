package fr.fireowls.apigame.item.equipment.armor.glove;

import fr.fireowls.apigame.item.equipment.armor.glove.gloves.*;

public enum GloveType {
    LEATHERGLOVE(LeatherGlove.class),
    IRONGLOVE(IronGlove.class);

    private Class<? extends Glove> c;

    private GloveType(Class<? extends Glove> c){
        this.c = c;
    }

    public Class<? extends Glove> getGloveClass() {
        return c;
    }
}
