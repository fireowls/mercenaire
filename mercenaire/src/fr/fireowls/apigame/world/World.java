package fr.fireowls.apigame.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Loader;
import fr.fireowls.apigame.utils.Updatable;
import fr.fireowls.apigame.world.chunk.Chunk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class World implements Updatable, Loader {

    private String name;
    private List<Chunk> chunks;
    private File file;

    private boolean loaded = false;

    public World() {
        this("world");
    }

    public World(String name) {
        this.chunks = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void create() {

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void draw(SpriteBatch batch) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public List<Chunk> getChunks() {
        return chunks;
    }

    public void addChunk(Chunk chunk) {
        this.chunks.add(chunk);
    }

    public void removeChunk(Chunk chunk) {
        this.chunks.remove(chunk);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
