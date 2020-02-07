package fr.fireowls.apigame.world.tile;

public enum Tiles {

    GRASS("grass", "textures/tiles/grass", GrassTile.class),
    GRAVEL("gravel", "textures/tiles/gravel", GravelTile.class);


    private String id;
    private String resources;
    private Class<? extends Tile> c;

    Tiles(String id, String resources, Class<? extends Tile> c) {
        this.id = id;
        this.resources = resources;
        this.c = c;
    }

    public String getId() {
        return id;
    }

    public String getResources() {
        return resources;
    }

    public Class<? extends Tile> getTileClass() {
        return c;
    }
}
