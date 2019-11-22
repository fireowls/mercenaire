package fr.fireowls.apigame.world.chunk;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import fr.fireowls.apigame.utils.factory.Factory;
import fr.fireowls.apigame.world.tile.Tile;

import java.io.File;

public class ChunkFactory extends Factory<Chunk> {

    public ChunkFactory(File file) {
        super(file);
    }

    @Override
    public Chunk parse() {
        return null;
    }

    private Tile parseTile(JsonValue value) {
        return null;
    }

    @Override
    public void save(Chunk element) {

    }

    private void saveTile() {

    }

}
