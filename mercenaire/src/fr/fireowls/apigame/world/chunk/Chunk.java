package fr.fireowls.apigame.world.chunk;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.tile.Tile;
import fr.fireowls.apigame.world.tile.Tiles;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class Chunk extends GameObject {

    public static final int CHUNK_SIZE = 8;

    private File file;
    private ChunkPosition position;
    private World world;

    private Tile[][] tiles;

    public Chunk(File file) {
        this.tiles = new Tile[CHUNK_SIZE][CHUNK_SIZE];
        this.file = file;

        // TODO Trouver un moyen de recuperer le monde du chunk

        JsonReader json = new JsonReader();
        JsonValue value = json.parse(Gdx.files.internal(file.getPath()));
        String[] position = value.getString("position").split(":");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);
        this.position = new ChunkPosition(x, y);

        JsonValue tiles = value.get("tiles");
        int col = 0, row = 0;
        for (JsonValue tile : tiles.iterator()) {
            Tiles type = Tiles.valueOf(tile.getString("type"));
            try {
                this.tiles[row][col] = type.getTileClass().getConstructor(Location.class).newInstance(
                        new Location(
                                world,
                                this.position.getX() + col,
                                this.position.getY() + row
                        ));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            row++;
            if (row >= CHUNK_SIZE) {
                col++;
                row = 0;
            }
        }
    }

    @Override
    protected void onCreate() {
        for (Tile[] t1 : tiles) {
            for (Tile t2 : t1) {
                t2.create();
            }
        }
    }

    @Override
    protected void onUpdate(float delta) {
        for (Tile[] t1 : tiles) {
            for (Tile t2 : t1) {
                t2.update(delta);
            }
        }
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        for (Tile[] t1 : tiles) {
            for (Tile t2 : t1) {
                t2.draw(batch);
            }
        }
    }

    @Override
    protected void onPause() {
        for (Tile[] t1 : tiles) {
            for (Tile t2 : t1) {
                t2.pause();
            }
        }
    }

    @Override
    protected void onResume() {
        for (Tile[] t1 : tiles) {
            for (Tile t2 : t1) {
                t2.resume();
            }
        }
    }

    @Override
    protected void onDispose() {
        for (Tile[] t1 : tiles) {
            for (Tile t2 : t1) {
                t2.dispose();
            }
        }
    }


    public ChunkPosition getPosition() {
        return position;
    }

    public File getFile() {
        return file;
    }
}
