package fr.fireowls.apigame.world.tile;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.Updatable;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.chunk.Chunk;

public class Tile implements Updatable {

    private Sprite sprite;
    private TileType type;
    private Chunk chunk;
    private World world;

    private int x;
    private int y;

    private Location location;

    public Tile(TileType type) {
        this.type = type;
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Chunk getChunk() {
        return chunk;
    }

    public void setChunk(Chunk chunk) {
        this.chunk = chunk;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
