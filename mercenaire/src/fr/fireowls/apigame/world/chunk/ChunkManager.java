package fr.fireowls.apigame.world.chunk;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.ApiGame;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.utils.game.GameObjectState;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.biome.Biome;
import fr.fireowls.apigame.world.biome.BiomeManager;
import fr.fireowls.apigame.world.tile.GrassTile;
import fr.fireowls.apigame.world.tile.TileInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ChunkManager extends GameObject {

    private World world;
    private List<Chunk> list;

    public ChunkManager(World world) {
        this.world = world;
        this.list = new ArrayList<>();
    }

    @Override
    protected void onCreate() {
        list.stream().forEach(Chunk::create);
    }

    @Override
    protected void onUpdate(float delta) {
        list.stream().forEach(chunk -> chunk.update(delta));
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        list.stream().forEach(chunk -> chunk.draw(batch));
    }

    @Override
    protected void onPause() {
        list.stream().forEach(Chunk::pause);
    }

    @Override
    protected void onResume() {
        list.stream().forEach(Chunk::resume);
    }

    @Override
    protected void onDispose() {
        list.stream().forEach(Chunk::dispose);
    }

    private void createChunk(ChunkPosition position) {

        if (!(position.getX() >= 0 && position.getX() < world.getTileInfos()[0].length
            && position.getY() >= 0 && position.getY() < world.getTileInfos().length))
            return;

        TileInfo[][] info = world.getTileInfos();

        Chunk chunk = new Chunk(world, position);
        for (int row = position.getY() * Chunk.CHUNK_SIZE ; row < position.getY() * Chunk.CHUNK_SIZE + Chunk.CHUNK_SIZE ; row ++) {
            for (int col = position.getX() * Chunk.CHUNK_SIZE ; col < position.getX() * Chunk.CHUNK_SIZE + Chunk.CHUNK_SIZE ; col ++) {

                TileInfo tileInfo = info[row][col];

                int x = col - position.getX() * Chunk.CHUNK_SIZE;
                int y = row - position.getY() * Chunk.CHUNK_SIZE;
                Location location = new Location(world, col, row);

                BiomeManager biomeManager = ApiGame.getBiomeManager();
                Biome biome = null;
                try {
                    biome = biomeManager.selectBiomeByValue(tileInfo.getHeat(), tileInfo.getWet());
                    chunk.getTiles()[y][x] = biome.selectTile(location);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
        list.add(chunk);
        chunk.create();
    }

    public void loadChunk(ChunkPosition position) {
        for (Chunk chunk : list) {
            if (chunk.getPosition().equals(position)) {
                switch (chunk.getState()) {
                    case PAUSE:
                        chunk.resume();
                        break;
                    case WAITING:
                    case STOP:
                        chunk.create();
                        break;
                }
                return;
            }
        }
        createChunk(position);
    }

    public void unloadChunk(ChunkPosition position) {
        list.stream().filter(chunk -> chunk.getPosition().equals(position)).filter(chunk -> chunk.getState() == GameObjectState.RUNNING).forEach(GameObject::pause);
    }

    public World getWorld() {
        return world;
    }

    public List<Chunk> getList() {
        return list;
    }
}
