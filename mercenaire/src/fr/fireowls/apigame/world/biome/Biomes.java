package fr.fireowls.apigame.world.biome;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Biomes {

    POLAR(0, 0, 0, 0),
    TUNDRA(0, 0, 0, 0),
    BOREAL_FOREST(0, 0, 0, 0),
    COLD_DESERT(0, 0,0, 0),
    PRAIRIE(0, 0, 0, 0),
    TEMP_DECIDUOUS_FOREST(0, 0, 0, 0),
    WARN_DESERT(0, 0, 0, 0),
    TROP_GRASS_LAND(0, 0, 0, 0),
    SAVANA(0,0, 0, 0),
    TROP_DECIDUOUS_FOREST(0,0, 0, 0),
    TROP_RAIN_FOREST(0,0, 0, 0);

    private float minHeat;
    private float minWet;

    private float maxHeat;
    private float maxWet;

    private Biomes(float minHeat, float minWet, float maxHeat, float maxWet) {
        this.minHeat = minHeat;
        this.minWet = minWet;
        this.maxHeat = maxHeat;
        this.maxWet = maxWet;
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

    public static List<Biomes> getCompatiblesBiomes(float heat, float wet) {
        List<Biomes> biomes = new ArrayList<Biomes>();
        for (Biomes biome : Biomes.values()) {
            if (heat >= biome.getMinHeat() && heat <= biome.getMaxHeat() && wet >= biome.getMinWet() && wet <= biome.getMaxWet()) {
                biomes.add(biome);
            }
        }
        return biomes;
    }

    public static Biomes selectBiome(float heat, float wet) {
        List<Biomes> biomes = getCompatiblesBiomes(heat, wet);
        return biomes.get(new Random().nextInt(biomes.size()));
    }

}
