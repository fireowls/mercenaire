package fr.fireowls.apigame.world.biome;

public abstract class Biome {

    protected Biomes type;

    protected float minHeat;
    protected float minWet;

    protected float maxHeat;
    protected float maxWet;

    public Biome(Biomes type) {
        this.type = type;
        this.minHeat = type.getMinHeat();
        this.minWet = type.getMinWet();
        this.maxHeat = type.getMaxHeat();
        this.maxWet = type.getMaxWet();
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

    public Biomes getType() {
        return type;
    }
}
