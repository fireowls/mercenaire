package fr.fireowls.apigame.world.biome;

import fr.fireowls.apigame.utils.ItemSelector;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.world.tile.Tile;
import fr.fireowls.apigame.world.tile.Tiles;

import java.lang.reflect.InvocationTargetException;

public abstract class Biome {

    protected Biomes type;

    protected float minHeat;
    protected float minWet;

    protected float maxHeat;
    protected float maxWet;

    protected float heat;
    protected float wet;

    protected ItemSelector<Tiles> selector;

    public Biome(Biomes type, float heat, float wet) {

        this.type = type;
        this.minHeat = type.getMinHeat();
        this.minWet = type.getMinWet();
        this.maxHeat = type.getMaxHeat();
        this.maxWet = type.getMaxWet();

        this.heat = heat;
        this.wet = wet;

        selector = new ItemSelector<Tiles>();
    }

    public Tile selectTile(Location location, float map) {
        try {
            return selector.selectItem(map)
                    .getTileClass().getConstructor(Location.class).newInstance(location);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }



    protected void addTile(Tiles tile, float frequency) {
        this.selector.addItem(tile, frequency);
    }

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

    public void setWet(float wet) {
        this.wet = wet;
    }

    public void setHeat(float heat) {
        this.heat = heat;
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
