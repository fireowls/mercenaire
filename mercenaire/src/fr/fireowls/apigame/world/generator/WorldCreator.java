package fr.fireowls.apigame.world.generator;

import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.generator.noise.PerlinNoise;
import fr.fireowls.apigame.world.generator.noise.WhiteNoise;
import fr.fireowls.apigame.world.tile.TileInfo;

import java.io.File;

public class WorldCreator {

    private String name;
    private int size;

    public WorldCreator(String name) {
        this(name, World.DEFAULT_WORLD_SIZE);
    }

    public WorldCreator(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public World generate() {
        System.out.println("generate new world '" + name + "'...");
        File worldFile = new File("worlds/" + name);
        worldFile.mkdirs();

        System.out.println("generate climate...");
        ClimateZone wet = new ClimateZone(size);
        ClimateZone heat = new ClimateZone(size);
        System.out.println("calculate climate...");
        wet.generate(new PerlinNoise(new WhiteNoise()));
        heat.generate(new PerlinNoise(new WhiteNoise()));
        System.out.println("generate tiles info...");
        TileInfo[][] tileInfos = generateInfo(heat, wet);

        World world = new World(name, tileInfos);

        return world;
    }

    private TileInfo[][] generateInfo(ClimateZone heat, ClimateZone wet) {
        TileInfo[][] info = new TileInfo[heat.getGrid().getGrid().length][heat.getGrid().getGrid()[0].length];

        for (int row = 0 ; row < info.length ; row++) {
            for (int col = 0 ; col < info[row].length ; col++) {
                info[row][col] = new TileInfo(col, row, heat.getGrid().getGrid()[row][col], wet.getGrid().getGrid()[row][col]);
            }
        }

        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
