package fr.fireowls.apigame.entity;

import fr.fireowls.apigame.utils.Updatable;

public abstract class Entity implements Updatable {

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
