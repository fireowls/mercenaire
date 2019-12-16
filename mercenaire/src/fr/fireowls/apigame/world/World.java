package fr.fireowls.apigame.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.EntityManager;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.generator.WorldGenerator;
import fr.fireowls.apigame.world.tile.TileInfo;

public class World extends GameObject {

    public static final int DEFAULT_WORLD_SIZE = 4000;

    private String name;
    private TileInfo[][] tileInfos;
    private WorldGenerator generator;
    private EntityManager manager;

    public World(String name, TileInfo[][] tileInfos) {
        this.name = name;
        this.tileInfos = tileInfos;
    }

    @Override
    protected void onCreate() {
        this.generator = new WorldGenerator(this);
        this.manager = new EntityManager(this);
        this.manager.create();
        this.generator.create();
    }

    @Override
    protected void onUpdate(float delta) {
        this.generator.update(delta);
        this.manager.update(delta);
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        this.generator.draw(batch);
        this.manager.draw(batch);
    }

    @Override
    protected void onPause() {
        this.generator.pause();
        this.manager.pause();
    }

    @Override
    protected void onResume() {
        this.generator.resume();
        this.manager.resume();
    }

    @Override
    protected void onDispose() {
        this.generator.dispose();
        this.manager.dispose();
    }

    public String getName() {
        return name;
    }

    public TileInfo[][] getTileInfos() {
        return tileInfos;
    }

    public WorldGenerator getGenerator() {
        return generator;
    }

    public EntityManager getEntityManager() {
        return manager;
    }
}
