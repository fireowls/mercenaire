package fr.fireowls.apigame.world.generator.noise;

public class PerlinNoise implements Noise {

    private int octave;

    public PerlinNoise(int octave) {
        this.octave = octave;
    }

    @Override
    public void transform(float[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
        float[][][] smoothNoise = new float[octave][][]; // an array of 2D arrays containing
        float persistance = 0.7f;

        for (int i = 0; i < octave; i++) {
            float[][] stage = new float[height][width];
            for (int j = 0 ; j < height ; j++) {
                for (int k = 0 ; k < width ; k++) {
                    stage[j][k] = grid[j][k];
                }
            }
            new SmoothNoise(i).transform(stage);
            smoothNoise[i] = stage;
        }

        float[][] perlinNoise = new float[height][width]; // an array of floats initialised to 0

        float amplitude = 1.0f;
        float totalAmplitude = 0.0f;

        for (int octave = this.octave - 1; octave >= 0; octave--) {
            amplitude *= persistance;
            totalAmplitude += amplitude;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    perlinNoise[i][j] += smoothNoise[octave][i][j] * amplitude;
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                perlinNoise[i][j] /= totalAmplitude;
            }
        }

        for (int i = 0 ; i < height ; i++) {
            for (int j = 0 ; j < width ; j++) {
                grid[i][j] = perlinNoise[i][j];
            }
        }

    }

    public int getOctave() {
        return octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }
}
