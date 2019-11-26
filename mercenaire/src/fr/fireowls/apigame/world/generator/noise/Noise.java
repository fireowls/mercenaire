package fr.fireowls.apigame.world.generator.noise;

public interface Noise {
    void transform(float[][] grid);

    static float interpolate (float x0, float x1, float alpha) {
        return x0 * (1 - alpha) + alpha * x1;
    }

}
