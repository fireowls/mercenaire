package fr.fireowls.apigame.world.generator;

import fr.fireowls.apigame.world.World;

public class Grid {

    private float[][] grid;
    private PerlinNoise perlinNoise;

    public Grid() {
        this(World.DEFAULT_WORLD_SIZE, null);
    }

    public Grid(long size, PerlinNoise perlinNoise) {
        this.grid = new float[(int) size][(int) size];
        this.perlinNoise = perlinNoise;
    }

    public void generate(float[][] grid, PerlinNoise perlinNoise) {
        for (int row = 0 ; row < grid.length ; row++) {
            for (int col = 0 ; col < grid[row].length ; col++) {
                grid[row][col] = perlinNoise.noise(col, row);
            }
        }
    }

    public float[][] generate(PerlinNoise perlinNoise) {
        generate(grid, perlinNoise);
        return grid;
    }

    public float[][] generate() {
        return generate(perlinNoise);
    }

    public float[][] getGrid() {
        return grid;
    }

    public void setPerlinNoise(PerlinNoise perlinNoise) {
        this.perlinNoise = perlinNoise;
    }
}
