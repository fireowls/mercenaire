package fr.fireowls.apigame.world.biome;

import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.world.tile.Tile;

public abstract class Biome {

    protected Biomes type;

    protected float minHeat;
    protected float minWet;

    protected float maxHeat;
    protected float maxWet;

    protected float heat;
    protected float wet;

    public Biome(Biomes type, float heat, float wet) {
        this.type = type;
        this.minHeat = type.getMinHeat();
        this.minWet = type.getMinWet();
        this.maxHeat = type.getMaxHeat();
        this.maxWet = type.getMaxWet();

        this.heat = heat;
        this.wet = wet;
    }

    public abstract Tile selectTile(Location location);

    public float getMinHeat() {
        return minHeat;
    }

    public float getMaxHeat() {
        return maxHeat;
    }

    public float getMaxWet() {
        return maxWet;
    }

    public float getMinWet() {
        return minWet;
    }

    public float getHeat() {
        return heat;
    }

    public float getWet() {
        return wet;
    }

    public Biomes getType() {
        return type;
    }
}
