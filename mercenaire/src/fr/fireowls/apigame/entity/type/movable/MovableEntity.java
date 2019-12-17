package fr.fireowls.apigame.entity.type.movable;

import fr.fireowls.apigame.entity.Entity;
import fr.fireowls.apigame.entity.type.EntityType;

public abstract class MovableEntity extends Entity implements Movable {

    public static final double DEFAULT_MAX_SPEED = 5;
    public static final double DEFAULT_ACCELERATION = 0.5;
    public static final double DEFAULT_DECELERATION = 0.1;

    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double deceleration;
    protected Direction direction;

    public MovableEntity(EntityType type, double maxSpeed, double acceleration, double deceleration) {
        super(type);
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        direction = Direction.STATIC;
        this.setOnUpdate(delta -> {
            speed = direction == Direction.STATIC ? Math.max(speed - deceleration, 0) : Math.min(speed + acceleration, maxSpeed);
            location.addX(direction.getX() * speed * delta);
            location.addY(direction.getY() * speed * delta);
        });
    }

    @Override
    public void move(Direction direction) {
        this.direction = direction;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getDeceleration() {
        return deceleration;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void setDeceleration(double deceleration) {
        this.deceleration = deceleration;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
