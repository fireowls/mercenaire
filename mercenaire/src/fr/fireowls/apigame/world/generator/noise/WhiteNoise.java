package fr.fireowls.apigame.world.generator.noise;

import com.badlogic.gdx.math.MathUtils;

public class WhiteNoise extends Noise {

    public WhiteNoise() {

    }

    public WhiteNoise(float[][] grid) {
        super(grid);
    }

    public WhiteNoise(Noise noise) {
        super(noise);
    }

    @Override
    protected void transformation() {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[x][y] = MathUtils.random();
            }
        }
    }

}
