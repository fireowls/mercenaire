package fr.fireowls.apigame.entity.type;

import fr.fireowls.apigame.entity.Entity;

public enum EntityType {

    PLAYER(Player.class);

    private Class<? extends Entity> c;

    private EntityType(Class<? extends Entity> c) {
        this.c = c;
    }

    public Class<? extends Entity> getEntityClass() {
        return c;
    }

}
