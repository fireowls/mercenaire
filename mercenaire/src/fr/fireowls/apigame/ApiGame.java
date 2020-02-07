package fr.fireowls.apigame;

import fr.fireowls.apigame.world.WorldManager;
import fr.fireowls.apigame.world.biome.BiomeManager;

/**
 * Cette class est le pillier centrale de toute l'api.
 * C'est avec celle-ci que tout les élement important du jeu
 * seront accecible en static.
 */
public class ApiGame {

    private static WorldManager worldManager;
    private static BiomeManager biomeManager;

    static {
        new ApiGame();
    }

    public ApiGame() {
        worldManager = new WorldManager();
        biomeManager = new BiomeManager();
    }

    public static BiomeManager getBiomeManager() {
        return biomeManager;
    }

    public static WorldManager getWorldManager() {
        return worldManager;
    }
}
