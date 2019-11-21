package fr.fireowls.apigame.world.tile;

import java.io.File;

public enum Tiles {

    GRASS("grass", "textures/tiles/grass", GrassTile.class);

    private String id;
    private File resources;
    private Class<? extends Tile> c;

    Tiles(String id, String resources, Class<? extends Tile> c) {
        this.id = id;
        this.resources = new File(resources);
        this.c = c;
    }

    public String getId() {
        return id;
    }

    public File getResourcesFile() {
        return resources;
    }

    public Class<? extends Tile> getTileClass() {
        return c;
    }
}
