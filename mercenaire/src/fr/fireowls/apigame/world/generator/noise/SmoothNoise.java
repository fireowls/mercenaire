package fr.fireowls.apigame.world.generator.noise;

public class SmoothNoise extends Noise {

    private int octave;

    public SmoothNoise(int octave) {
        this.octave = octave;
    }

    public SmoothNoise(int octave, float[][] grid) {
        super(grid);
        this.octave = octave;
    }

    public SmoothNoise(int octave, Noise noise) {
        super(noise);
        this.octave = octave;
    }

    @Override
    protected void transformation() {
        int height = grid.length;
        int width = grid[0].length;
        float[][] smoothNoise = new float[height][width];

        int samplePeriod = 1 << octave; // calculates 2 ^ k
        float sampleFrequency = 1.0f / samplePeriod;
        for (int i = 0; i < height; i++) {
            int sample_i0 = (i / samplePeriod) * samplePeriod;
            int sample_i1 = (sample_i0 + samplePeriod) % height; // wrap around
            float horizontal_blend = (i - sample_i0) * sampleFrequency;

            for (int j = 0; j < width; j++) {
                int sample_j0 = (j / samplePeriod) * samplePeriod;
                int sample_j1 = (sample_j0 + samplePeriod) % width; // wrap around
                float vertical_blend = (j - sample_j0) * sampleFrequency;
                float top = Noise.interpolate(grid[sample_i0][sample_j0], grid[sample_i1][sample_j0], horizontal_blend);
                float bottom = Noise.interpolate(grid[sample_i0][sample_j1], grid[sample_i1][sample_j1], horizontal_blend);
                smoothNoise[i][j] = Noise.interpolate(top, bottom, vertical_blend);
            }
        }

        for (int i = 0 ; i < height ; i++) {
            for (int j = 0 ; j < width ; j++) {
                grid[i][j] = smoothNoise[i][j];
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
