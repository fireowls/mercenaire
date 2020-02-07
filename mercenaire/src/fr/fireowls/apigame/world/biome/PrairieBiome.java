package fr.fireowls.apigame.world.biome;

import fr.fireowls.apigame.world.tile.Tiles;

public class PrairieBiome extends Biome {

    public PrairieBiome(float heat, float wet) {
        super(Biomes.PRAIRIE, heat, wet);

        addTile(Tiles.GRAVEL, 0.2f);
        addTile(Tiles.GRASS, 0.8f);
    }
}
