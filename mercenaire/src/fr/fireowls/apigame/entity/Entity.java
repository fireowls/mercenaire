package fr.fireowls.apigame.entity;

import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.utils.game.GameObjectState;

public abstract class Entity extends GameObject {

    private Location location;
    private EntityMeta entityMeta;
    private EntityManager entityManager;

    public Entity(EntityMeta entityMeta, EntityManager entityManager) {
        this.entityManager = entityManager;
        this.entityMeta = entityMeta;
    }

    public void destroy() {
        this.entityManager.removeEntity(this);
        if (getState() != GameObjectState.STOP) {
            dispose();
        }
    }

    public EntityMeta getEntityMeta() {
        return entityMeta;
    }

    public void setEntityMeta(EntityMeta entityMeta) {
        this.entityMeta = entityMeta;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
