package fr.fireowls.apigame.world.generator;

import fr.fireowls.apigame.world.World;

public class WorldGenerator {

    private String name;
    private String seed;

    public WorldGenerator(String name) {
        this(name, null);
    }

    public WorldGenerator(String name, String seed) {
        this.name = name;
        this.seed = seed;
    }

    public World generate() {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getSeed() {
        return seed;
    }

}
