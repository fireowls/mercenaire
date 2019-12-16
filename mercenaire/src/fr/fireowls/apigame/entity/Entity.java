package fr.fireowls.apigame.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.shape.EntityShape;
import fr.fireowls.apigame.entity.type.EntityType;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;

public abstract class Entity extends GameObject {

    protected Location location;
    protected EntityShape shape;
    protected EntityMeta meta;
    protected EntityType type;

    public Entity(EntityType type, EntityShape shape) {
        this(type, shape, new EntityMeta());
    }

    public Entity(EntityType type, EntityShape shape, EntityMeta meta) {
        this.type = type;
        this.shape = shape;
        this.meta = meta;

        setOnCreate(shape::create);
        setOnUpdate(shape::update);
        setOnDraw(shape::draw);
        setOnPause(shape::pause);
        setOnResume(shape::resume);
        setOnDispose(shape::dispose);

        setOnUpdate(delta -> {
            if (meta != null && meta.getSpriteSheet() != null) {
                meta.getSpriteSheet().update(delta);
            }
        });
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        if (location != null) {
            batch.draw(
                    meta.getSpriteSheet().getTexture(),
                    location.getDrawingX(),
                    location.getDrawingY(),
                    meta.getSpriteSheet().getWidth(),
                    meta.getSpriteSheet().getHeight()
            );
        }
    }

    public EntityMeta getMeta() {
        return meta;
    }

    public EntityShape getShape() {
        return shape;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public EntityType getType() {
        return type;
    }
}
