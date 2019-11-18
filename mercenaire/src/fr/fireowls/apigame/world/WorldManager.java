package fr.fireowls.apigame.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Updatable;

import java.util.ArrayList;
import java.util.List;

public class WorldManager implements Updatable {

    private List<World> worlds;

    public WorldManager() {
        this.worlds = new ArrayList<>();
    }

    @Override
    public void create() {
        worlds.stream().filter(World::isLoaded).forEach(World::create);
    }

    @Override
    public void update(float delta) {
        worlds.stream().filter(World::isLoaded).forEach(x -> x.update(delta));
    }

    @Override
    public void draw(SpriteBatch batch) {
        worlds.stream().filter(World::isLoaded).forEach(x -> x.draw(batch));
    }

    @Override
    public void pause() {
        worlds.stream().filter(World::isLoaded).forEach(World::pause);
    }

    @Override
    public void resume() {
        worlds.stream().filter(World::isLoaded).forEach(World::resume);
    }

    @Override
    public void dispose() {
        worlds.stream().filter(World::isLoaded).forEach(World::dispose);
    }

    public void focus(int world) {
        World w = worlds.get(world);
        worlds.stream().forEach(world1 -> world1.setLoaded(false));
        w.setLoaded(true);
    }

    public List<World> getWorlds() {
        return worlds;
    }

    public void setWorlds(List<World> worlds) {
        this.worlds = worlds;
    }
}
