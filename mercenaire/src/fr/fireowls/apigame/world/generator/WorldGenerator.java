package fr.fireowls.apigame.world.generator;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.chunk.ChunkManager;

public class WorldGenerator extends GameObject {

    private World world;
    private ChunkManager manager;

    public WorldGenerator(World world) {
        this.world = world;
        this.manager = new ChunkManager(world);
    }

    @Override
    protected void onCreate() {
        manager.create();
    }

    @Override
    protected void onUpdate(float delta) {
        manager.update(delta);
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        manager.draw(batch);
    }

    @Override
    protected void onPause() {
        manager.pause();
    }

    @Override
    protected void onResume() {
        manager.resume();
    }

    @Override
    protected void onDispose() {
        manager.dispose();
    }

    public World getWorld() {
        return world;
    }
}
