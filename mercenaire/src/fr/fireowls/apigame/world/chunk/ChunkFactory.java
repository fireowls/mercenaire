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
        Chunk chunk = new Chunk();

        JsonReader json = new JsonReader();
        JsonValue value = json.parse(Gdx.files.internal(file.getPath()));

        String[] position = value.getString("position").split(":");

        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);

        chunk.setPosition(new ChunkPosition(x, y));
        chunk.setFile(file);
        x = y = -1;
        JsonValue tiles = value.get("tiles");
        for (JsonValue tile : tiles.iterator()) {
            Tile t = parseTile(tile);

            y = x <= 0 ? y+1 : y;
            x = x < Chunk.CHUNK_SIZE ? x+1 : 0;

            t.setX(x);
            t.setY(y);

            t.setChunk(chunk);
            t.setWorld(chunk.getWorld());

            chunk.setTile(t, x, y);
        }

        return chunk;
    }

    private Tile parseTile(JsonValue value) {
        TileType type = TileType.valueOf(value.getString("type"));
        Tile tile = new Tile(type);
        return tile;
    }

    @Override
    public void save(Chunk element) {

    }

    private void saveTile() {

    }

}
