package fr.fireowls.apigame.world.generator.noise;

public class PerlinNoise extends Noise {

    public static final int DEFAULT_OCTAVES = 8;
    public static final float DEFAULT_PERSISTANCE = 0.7f;
    public static final float DEFAULT_AMPLITUDE = 1.0f;

    private int octave;
    private float persistance;
    private float amplitude;

    public PerlinNoise() {
        this(DEFAULT_OCTAVES, DEFAULT_PERSISTANCE, DEFAULT_AMPLITUDE);
    }

    public PerlinNoise(int octave) {
        this(octave, DEFAULT_PERSISTANCE, DEFAULT_AMPLITUDE);
    }

    public PerlinNoise(int octave, float persistance) {
        this(octave, persistance, DEFAULT_AMPLITUDE);
    }

    public PerlinNoise(int octave, float persistance, float amplitude, float[][] grid) {
        this(octave, persistance, amplitude);
        super.setGrid(grid);
    }

    public PerlinNoise(int octave, float persistance, float amplitude, Noise noise) {
        this(octave, persistance, amplitude);
        super.setGrid(noise.getGrid());
        super.setNoise(noise);
    }

    public PerlinNoise(Noise noise) {
        this(DEFAULT_OCTAVES, DEFAULT_PERSISTANCE, DEFAULT_AMPLITUDE, noise);
    }

    public PerlinNoise(float[][] grid) {
        this(DEFAULT_OCTAVES, DEFAULT_PERSISTANCE, DEFAULT_AMPLITUDE, grid);
    }

    public PerlinNoise(int octave, float persistance, float amplitude) {
        this.octave = octave;
        this.persistance = persistance;
        this.amplitude = amplitude;
    }

    @Override
    protected void transformation() {
        int width = grid[0].length;
        int height = grid.length;
        float[][][] smoothNoise = new float[octave][][]; // an array of 2D arrays containing

        for (int i = 0; i < octave; i++) {
            float[][] copyGrid = new float[height][width];
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    copyGrid[j][k] = grid[j][k];
                }
            }
            new SmoothNoise(i, copyGrid).transform();
            smoothNoise[i] = copyGrid;
        }

        float amplitude = this.amplitude;
        float totalAmplitude = 0.0f;

        for (int octave = this.octave - 1; octave >= 0; octave--) {

            amplitude *= this.persistance;
            totalAmplitude += amplitude;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    grid[i][j] += smoothNoise[octave][i][j] * amplitude;
                    if (octave == 0)
                        grid[i][j] /= totalAmplitude;
                }
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
