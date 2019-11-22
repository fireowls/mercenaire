package fr.fireowls.apigame.world.tile;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.utils.textures.SpriteSheet;

import java.io.File;

public abstract class Tile extends GameObject {

    public final static int TILE_SIZE = 128;

    private String id;
    private Tiles type;
    private File resources;

    private SpriteSheet spriteSheet;
    private Location location;

    public Tile(Tiles type, Location location) {
        this.id = type.getId();
        this.type = type;
        this.location = location;
        this.resources = type.getResourcesFile();
        this.spriteSheet = new SpriteSheet(resources);

    }

    @Override
    protected void onUpdate(float delta) {
        spriteSheet.update(delta);
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        batch.draw(spriteSheet.getTexture(), (float) (location.getX() * TILE_SIZE), (float) (location.getY() * TILE_SIZE),
                (float) TILE_SIZE, (float) TILE_SIZE);
    }


    public String getId() {
        return id;
    }

    public void setResources(File resources) {
        this.resources = resources;
        this.spriteSheet = new SpriteSheet(resources);
    }

    public SpriteSheet getSpriteSheet() {
        return spriteSheet;
    }

    public File getResources() {
        return resources;
    }

    public Tiles getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }
}
