package fr.fireowls.apigame.entity;

import fr.fireowls.apigame.utils.game.GameObject;

public abstract class Entity extends GameObject {

    private EntityMeta entityMeta;

    public Entity() {

    }

    public EntityMeta getEntityMeta() {
        return entityMeta;
    }

    public void setEntityMeta(EntityMeta entityMeta) {
        this.entityMeta = entityMeta;
    }
}
