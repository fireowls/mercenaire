package fr.fireowls.apigame.world.chunk;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import fr.fireowls.apigame.utils.Factory;
import fr.fireowls.apigame.world.tile.Tile;

import java.io.File;

public class ChunkFactory extends Factory<Chunk> {

    public ChunkFactory(File file) {
        super(file);
    }

    @Override
    public Chunk parse() {
        Chunk chunk = new Chunk();

        JsonReader json = new JsonReader();
        JsonValue value = json.parse(Gdx.files.internal(file.getPath()));

        String[] position = value.getString("position").split(":");

        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);

        chunk.setPosition(new ChunkPosition(x, y));

        JsonValue tiles = value.get("tiles");
        for (JsonValue tile : tiles.iterator()) {
            Tile t = parseTile(tile);

        }

        return chunk;
    }

    private Tile parseTile(JsonValue value) {
        Tile tile = new Tile();

        return tile;
    }

    @Override
    public void save(Chunk element) {

    }

    private void saveTile() {

    }

}
