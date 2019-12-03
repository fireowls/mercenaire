package fr.fireowls.apigame.world.biome;

import java.lang.reflect.InvocationTargetException;

public class BiomeManager {

    public Biome selectBiomeByValue(float heat, float wet) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Biomes biome = Biomes.selectBiome(heat, wet);
        System.out.println(biome);
        return biome.getBiomeClass().getConstructor(Float.TYPE, Float.TYPE).newInstance(heat, wet);
    }

}
