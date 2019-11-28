package fr.fireowls.apigame.world.generator;

import fr.fireowls.apigame.world.generator.noise.Noise;

public class ClimateZone {

    private int size;
    private Grid grid;

    public ClimateZone(int size) {
        this.size = size;
    }

    public Grid generate(Noise noise) {
        grid = new Grid(size);
        grid.applyNoise(noise);
        return grid;
    }

    public Grid getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }

}
