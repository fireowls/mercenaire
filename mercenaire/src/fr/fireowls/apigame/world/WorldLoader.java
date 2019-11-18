package fr.fireowls.apigame.world;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WorldLoader {

    private String worldDirectory;
    private File worldFile;

    private List<World> worlds;

    public WorldLoader() {
        this("worlds");
    }

    public WorldLoader(String worldDirectory) {
        this.worldDirectory = worldDirectory;
        this.worldFile = new File(worldDirectory);
        this.worlds = new ArrayList<>();
    }

    public void loadWorlds() {
        File[] worlds = worldFile.listFiles();
        for (File world : worlds) {
            WorldFactory factory = new WorldFactory(world);
            this.worlds.add(factory.parse());
        }
    }

    public List<World> getWorlds() {
        return worlds;
    }

    public String getWorldDirectory() {
        return worldDirectory;
    }

    public void setWorldDirectory(String worldDirectory) {
        this.worldDirectory = worldDirectory;
        this.worldFile = new File(worldDirectory);
    }
}
