package fr.fireowls.apigame.world.generator.noise;

import com.badlogic.gdx.math.MathUtils;

public class WhiteNoise implements Noise {

    @Override
    public void transform(float[][] grid) {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[x][y] = MathUtils.random();
            }
        }
    }

}
