package fr.fireowls.apigame.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.type.EntityType;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class EntityManager extends GameObject {

    private World world;
    private List<Localizable> entities;

    public EntityManager(World world) {
        this.world = world;
        entities = new ArrayList<>();
    }

    @Override
    protected void onCreate() {
        entities.forEach(Localizable::create);
    }

    @Override
    protected void onUpdate(float delta) {
        entities.forEach(entity -> entity.update(delta));
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        entities.forEach(entity -> entity.draw(batch));
    }

    @Override
    protected void onPause() {
        entities.forEach(Localizable::pause);
    }

    @Override
    protected void onResume() {
        entities.forEach(Localizable::resume);
    }

    @Override
    protected void onDispose() {
        entities.forEach(Localizable::dispose);
    }

    public Localizable spawnEntity(EntityType type, Location location) {
        try {
            Entity entity = type.getEntityClass().getConstructor().newInstance();
            entity.setLocation(location);
            entity.setEntityManager(this);
            entities.add(entity);
            entity.create();
            return entity;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void killEntity(Entity entity) {
        entities.remove(entity);
        entity.dispose();
    }

    public World getWorld() {
        return world;
    }

    public List<Localizable> getEntities() {
        return entities;
    }
}
