package fr.fireowls.apigame.world.biome;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BiomeManager {

    private List<Biome> biomes;

    public BiomeManager() {
        biomes = new ArrayList<>();
        for (Biomes b : Biomes.values()) {
            try {
                biomes.add(b.getBiomeClass().getConstructor(Float.TYPE, Float.TYPE).newInstance(0f, 0f));
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public void addBiome(Biome biome) {
        this.biomes.add(biome);
    }

    public Biome selectBiomeByValue(float heat, float wet) {
        Biome biome = selectBiome(heat, wet);
        biome.setHeat(heat);
        biome.setWet(wet);
        return biome;
    }

    public List<Biome> getCompatiblesBiomes(float heat, float wet) {
        List<Biome> biomes = new ArrayList<>();
        this.biomes.stream()
                .filter(x -> heat >= x.getMinHeat())
                .filter(x -> heat <= x.getMaxHeat())
                .filter(x -> wet >= x.getMinWet())
                .filter(x -> wet <= x.getMaxWet())
                .forEach(biomes::add);
        if (biomes.size() == 0) {
            //TODO throw ERROR
        }
        return biomes;
    }

    public Biome selectBiome(float heat, float wet) {
        List<Biome> biomes = getCompatiblesBiomes(heat, wet);
        return biomes.get(new Random().nextInt(biomes.size()));
    }

}
