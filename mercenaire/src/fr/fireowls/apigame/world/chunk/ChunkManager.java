package fr.fireowls.apigame.world.chunk;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;

import java.util.ArrayList;
import java.util.List;

public class ChunkManager extends GameObject {

    private World world;
    private List<Chunk> list;

    public ChunkManager(World world) {
        this.world = world;
        this.list = new ArrayList<>();
    }

    @Override
    protected void onCreate() {
        list.stream().forEach(Chunk::create);
    }

    @Override
    protected void onUpdate(float delta) {
        list.stream().forEach(chunk -> chunk.update(delta));
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        list.stream().forEach(chunk -> chunk.draw(batch));
    }

    @Override
    protected void onPause() {
        list.stream().forEach(Chunk::pause);
    }

    @Override
    protected void onResume() {
        list.stream().forEach(Chunk::resume);
    }

    @Override
    protected void onDispose() {
        list.stream().forEach(Chunk::dispose);
    }

    public void addChunk(Chunk chunk) {
        list.add(chunk);
    }

    public World getWorld() {
        return world;
    }

    public List<Chunk> getList() {
        return list;
    }
}
