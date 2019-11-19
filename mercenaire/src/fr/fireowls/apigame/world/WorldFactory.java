package fr.fireowls.apigame.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.JsonWriter;
import fr.fireowls.apigame.utils.factory.Factory;
import fr.fireowls.apigame.world.chunk.Chunk;
import fr.fireowls.apigame.world.chunk.ChunkFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorldFactory extends Factory<World> {

    public static final String WORLD_INFO_FILE_NAME = "world-info.json";

    public WorldFactory(File file) {
        super(file);
    }

    @Override
    public World parse() {
        JsonReader json = new JsonReader();
        JsonValue value = json.parse(Gdx.files.internal(file.getPath()+"/"+WORLD_INFO_FILE_NAME));

        String name = value.getString("name");

        World world = new World();
        world.setName(name);
        world.setFile(file);

        for (File chunkFile : new File(file.getPath()+"/chunks").listFiles()) {
            ChunkFactory chunkFactory = new ChunkFactory(chunkFile);
            Chunk chunk = chunkFactory.parse();
            chunk.setWorld(world);
            world.addChunk(chunk);
        }

        return world;
    }

    @Override
    public void save(World element) {
        try {
            FileWriter writer = new FileWriter(file);
            JsonWriter json = new JsonWriter(writer);

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (Chunk chunk : element.getChunks()) {
            ChunkFactory factory = new ChunkFactory(chunk.getFile());
            factory.save(chunk);
        }

    }
}
