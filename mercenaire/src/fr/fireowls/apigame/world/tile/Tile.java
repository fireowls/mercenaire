package fr.fireowls.apigame.world.tile;

import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.utils.textures.SpriteSheet;

import java.io.File;

public abstract class Tile extends GameObject {

    public final static int TILE_SIZE = 128;

    private String id;
    private Tiles type;
    private File resources;

    private SpriteSheet spriteSheet;

    public Tile(String id, Tiles type, File resources) {
        this.id = id;
        this.type = type;
        this.resources = resources;



    }


    public String getId() {
        return id;
    }

    public void setResources(File resources) {
        this.resources = resources;
    }

    public File getResources() {
        return resources;
    }

    public Tiles getType() {
        return type;
    }
}
