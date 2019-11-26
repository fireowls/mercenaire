package fr.fireowls.apigame.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.chunk.Chunk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class World extends GameObject {

    public static final long DEFAULT_WORLD_SIZE = 300_000_000L;

    private String name;
    private String seed;
    private File file;

    private List<Chunk> chunks;

    public World(String name, String seed) {
        this(name, seed, new ArrayList<Chunk>());
    }

    public World(String name, String seed, List<Chunk> chunks) {
        this.name = name;
        this.seed = seed;
        this.chunks = chunks;
        this.file = new File("worlds/" + name);

    }

    @Override
    protected void onCreate() {
        chunks.stream().forEach(Chunk::create);
    }

    @Override
    protected void onUpdate(float delta) {
        chunks.stream().forEach(x -> x.update(delta));
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        chunks.stream().forEach(x -> x.draw(batch));
    }

    @Override
    protected void onPause() {
        chunks.stream().forEach(Chunk::pause);
    }

    @Override
    protected void onResume() {
        chunks.stream().forEach(Chunk::resume);
    }

    @Override
    protected void onDispose() {
        chunks.stream().forEach(Chunk::dispose);
    }

    public String getName() {
        return name;
    }

    public String getSeed() {
        return seed;
    }

    public File getFile() {
        return file;
    }

    public List<Chunk> getChunks() {
        return chunks;
    }
}
