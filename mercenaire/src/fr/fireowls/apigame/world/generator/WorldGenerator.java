package fr.fireowls.apigame.world.generator;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.ChunkLoader;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.chunk.ChunkManager;
import fr.fireowls.apigame.world.chunk.ChunkPosition;

import java.util.ArrayList;
import java.util.List;

public class WorldGenerator extends GameObject {

    public static final int CHUNK_LOADER_RADIUS = 5;

    private World world;
    private ChunkManager manager;
    private List<ChunkLoader> loaderList;

    public WorldGenerator(World world) {
        this.world = world;
        this.manager = new ChunkManager(world);
        loaderList = new ArrayList<>();
    }

    @Override
    protected void onCreate() {
        manager.create();
    }

    @Override
    protected void onUpdate(float delta) {
        manager.update(delta);
        for (ChunkLoader loader : loaderList) {
            for (int row = -(CHUNK_LOADER_RADIUS / 2) ; row <= (CHUNK_LOADER_RADIUS / 2) ; row++) {
                for (int col = -(CHUNK_LOADER_RADIUS / 2) ; col <= (CHUNK_LOADER_RADIUS / 2) ; col++) {
                    manager.loadChunk(new ChunkPosition(loader.getChunkPosition().getX() + col, loader.getChunkPosition().getY() + row));
                }
            }
        }
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

    public void addChunkLoader(ChunkLoader loader) {
        this.loaderList.add(loader);
    }

    public void removeChunkLoader(ChunkLoader loader) {
        this.loaderList.remove(loader);
    }

    public World getWorld() {
        return world;
    }

    public ChunkManager getManager() {
        return manager;
    }

    public List<ChunkLoader> getLoaderList() {
        return loaderList;
    }
}
