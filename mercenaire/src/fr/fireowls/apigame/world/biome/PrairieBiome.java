package fr.fireowls.apigame.world.biome;

import fr.fireowls.apigame.utils.ItemSelector;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.world.tile.Tile;
import fr.fireowls.apigame.world.tile.Tiles;

import java.lang.reflect.InvocationTargetException;

public class PrairieBiome extends Biome {

    private ItemSelector<Tiles> selector;

    public PrairieBiome(float heat, float wet) {
        super(Biomes.PRAIRIE, heat, wet);
        selector = new ItemSelector<>();

        selector.addItem(Tiles.GRASS, 1);
    }

    @Override
    public Tile selectTile(Location location) {
        try {
            return selector.selectItem().getTileClass().getConstructor(Location.class).newInstance(location);
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
