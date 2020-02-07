package fr.fireowls.apigame.entity.type.living;

import fr.fireowls.apigame.entity.type.EntityType;
import fr.fireowls.apigame.entity.type.movable.MovableEntity;

public abstract class LivingEntity extends MovableEntity {

    public static final double DEFAULT_MAX_HEALTH = 20;

    protected double health;
    protected double maxHealth;

    public LivingEntity(EntityType type, double maxHealth, double maxSpeed, double acceleration, double deceleration) {
        super(type, maxSpeed, acceleration, deceleration);
        this.health = maxHealth;
        this.maxHealth = maxHealth;
    }

    public void heal(double healthPoint) {
        this.health += healthPoint;
    }

    public void hurt(double healthPoint) {
        this.health -= healthPoint;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }
}
