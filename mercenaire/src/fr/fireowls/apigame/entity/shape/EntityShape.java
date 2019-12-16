package fr.fireowls.apigame.entity.shape;

import fr.fireowls.apigame.utils.game.GameObject;

public abstract class EntityShape extends GameObject {

    protected ShapeType type;

    public EntityShape(ShapeType type) {
        this.type = type;
    }

    public ShapeType getType() {
        return type;
    }
}
