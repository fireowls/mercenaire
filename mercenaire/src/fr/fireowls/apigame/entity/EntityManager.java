package fr.fireowls.apigame.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;

import java.util.ArrayList;
import java.util.List;

public class EntityManager extends GameObject {

    private World world;
    private List<Entity> entities;

    public EntityManager(World world) {
        this.world = world;
        entities = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
        switch (entity.getState()) {
            case WAITING:
            case STOP:
                entity.create();
                break;
            case PAUSE:
                entity.resume();
                break;
        }
    }

    public void removeEntity(Entity entity) {
        this.entities.remove(entity);
        entity.dispose();
    }

    @Override
    protected void onCreate() {
        entities.stream().forEach(Entity::create);
    }

    @Override
    protected void onUpdate(float delta) {
        entities.stream().forEach(entity -> entity.update(delta));
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        entities.stream().forEach(entity -> entity.draw(batch));
    }

    @Override
    protected void onPause() {
        entities.stream().forEach(Entity::pause);
    }

    @Override
    protected void onResume() {
        entities.stream().forEach(Entity::resume);
    }

    @Override
    protected void onDispose() {
        entities.stream().forEach(Entity::dispose);
    }

    public World getWorld() {
        return world;
    }

    public List<Entity> getEntities() {
        return entities;
    }
}
