package fr.fireowls.apigame.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.type.movable.Direction;
import fr.fireowls.apigame.entity.type.movable.Movable;

public class Player extends Localizable implements Movable {

    protected Entity entity;

    public Player(Entity entity) {
        this.entity = entity;
    }

    @Override
    protected void onCreate() {
        entity.create();
        location = entity.getLocation();
        location.addChild(entity.getLocation());
    }

    @Override
    protected void onUpdate(float delta) {
        entity.update(delta);
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        entity.draw(batch);
    }

    @Override
    protected void onPause() {
        entity.pause();
    }

    @Override
    protected void onResume() {
        entity.resume();
    }

    @Override
    protected void onDispose() {
        entity.dispose();
    }

    public Entity getEntity() {
        return entity;
    }

    @Override
    public void move(Direction direction) {
        if (entity instanceof Movable) {
            ((Movable) entity).move(direction);
        }
    }
}
