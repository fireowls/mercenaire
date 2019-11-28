package fr.fireowls.apigame.world.generator.noise;

public abstract class Noise {

    protected Noise noise;
    protected float[][] grid;

    public Noise() { }

    public Noise(float[][] grid) {
        this.setGrid(grid);
    }

    public Noise(Noise noise) {
        this.setNoise(noise);
        this.setGrid(noise.getGrid());
    }

    public void transform() {
        if (noise != null) {
            noise.setGrid(grid);
            noise.transform();
        }
        transformation();
    }

    protected abstract void transformation();

    public static float interpolate(float x0, float x1, float alpha) {
        return x0 * (1 - alpha) + alpha * x1;
    }

    public float[][] getGrid() {
        return grid;
    }

    public Noise getNoise() {
        return noise;
    }

    public void setGrid(float[][] grid) {
        this.grid = grid;
    }

    public void setNoise(Noise noise) {
        this.noise = noise;
    }
}
