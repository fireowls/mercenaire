package fr.fireowls.apigame.world.biome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Biomes {

    PRAIRIE(0, 0, 100, 100, PrairieBiome.class);
    // POLAR(0, 0, 0, 0),
    // TUNDRA(0, 0, 0, 0),
    // BOREAL_FOREST(0, 0, 0, 0),
    // COLD_DESERT(0, 0,0, 0),
    // TEMP_DECIDUOUS_FOREST(0, 0, 0, 0),
    // WARN_DESERT(0, 0, 0, 0),
    // TROP_GRASS_LAND(0, 0, 0, 0),
    // SAVANA(0,0, 0, 0),
    // TROP_DECIDUOUS_FOREST(0,0, 0, 0),
    // TROP_RAIN_FOREST(0,0, 0, 0);

    private float minHeat;
    private float minWet;

    private float maxHeat;
    private float maxWet;

    private Class<? extends Biome> c;

    private Biomes(float minHeat, float minWet, float maxHeat, float maxWet, Class<? extends Biome> c) {
        this.minHeat = minHeat;
        this.minWet = minWet;
        this.maxHeat = maxHeat;
        this.maxWet = maxWet;
        this.c = c;
    }


    public float getMinHeat() {
        return minHeat;
    }

    public float getMinWet() {
        return minWet;
    }

    public float getMaxWet() {
        return maxWet;
    }

    public float getMaxHeat() {
        return maxHeat;
    }

    public Class<? extends Biome> getBiomeClass() {
        return c;
    }

}
