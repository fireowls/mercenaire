package fr.fireowls.apigame.world.chunk;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Loader;
import fr.fireowls.apigame.utils.Updatable;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.tile.Tile;

import java.io.File;
import java.util.Arrays;

public class Chunk implements Updatable, Loader {

    public static final int CHUNK_SIZE = 8;

    private Tile[][] tiles;
    private boolean loaded;

    private ChunkPosition position;
    private World world;
    private File file;

    public Chunk() {
        tiles = new Tile[CHUNK_SIZE][CHUNK_SIZE];
    }

    @Override
    public void create() {
        Arrays.stream(tiles).forEach(row -> Arrays.stream(row).forEach(Tile::create));
    }

    @Override
    public void update(float delta) {
        Arrays.stream(tiles).forEach(row -> Arrays.stream(row).forEach(x -> x.update(delta)));
    }

    @Override
    public void draw(SpriteBatch batch) {
        Arrays.stream(tiles).forEach(row -> Arrays.stream(row).forEach(x -> x.draw(batch)));
    }

    @Override
    public void pause() {
        Arrays.stream(tiles).forEach(row -> Arrays.stream(row).forEach(Tile::pause));
    }

    @Override
    public void resume() {
        Arrays.stream(tiles).forEach(row -> Arrays.stream(row).forEach(Tile::resume));
    }

    @Override
    public void dispose() {
        Arrays.stream(tiles).forEach(row -> Arrays.stream(row).forEach(Tile::dispose));
    }

    public Tile getTile(int x, int y) {
        return tiles[y][x];
    }

    public void setTile(Tile tile, int x, int y) {
        this.tiles[x][y] = tile;
    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public ChunkPosition getPosition() {
        return position;
    }

    public void setPosition(ChunkPosition position) {
        this.position = position;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
