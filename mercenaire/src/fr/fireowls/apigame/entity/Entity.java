package fr.fireowls.apigame.entity;

import fr.fireowls.apigame.entity.type.EntityType;

public abstract class Entity extends Localizable {

    protected EntityManager entityManager;
    protected EntityType type;

    public Entity(EntityType type) {
        this.type = type;
    }

    public void kill() {
        if (entityManager != null) {
            entityManager.killEntity(this);
        }
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityType getType() {
        return type;
    }
}
