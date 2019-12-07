package fr.fireowls.apigame.utils;

import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.chunk.Chunk;
import fr.fireowls.apigame.world.chunk.ChunkPosition;
import fr.fireowls.apigame.world.tile.Tile;

/**
 * Une location représente une coordonée GPS sur un monde
 */
public class Location {

    /**
     * Le monde dans le quel les coordonnées sont valide
     */
    private World world;
    /**
     * position x
     */
    private double x;
    /**
     * position y
     */
    private double y;

    /**
     * Créer une nouvelle coordonée
     * @param world le monde dans le quel la Location est valide
     * @param x la position x
     * @param y la position y
     */
    public Location(World world, double x, double y) {
        this.world = world;
        this.x = x;
        this.y = y;
    }

    /**
     * Recuperer le monde
     * @return le monde dans le quel s'applique la Location
     */
    public World getWorld() {
        return world;
    }

    /**
     * Determiner le monde
     * @param world le monde en question
     */
    public void setWorld(World world) {
        this.world = world;
    }

    /**
     * Position x
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Position y
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * Convertie la position x pour afficher un objet sur l'écrant a la bonne position
     * @return x convertie
     */
    public float getDrawingX() {
        return (float) x * Tile.TILE_SIZE;
    }

    /**
     * Convertie la position y pour afficher un objet sur l'écrant a la bonne position
     * @return y convertie
     */
    public float getDrawingY() {
        return (float) y * Tile.TILE_SIZE;
    }

    /**
     * Definir la position x
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Definir la position y
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    public ChunkPosition getChunkPosition() {
        return new ChunkPosition(((int) (x - (x % Chunk.CHUNK_SIZE))/ Chunk.CHUNK_SIZE), ((int) (y - (y % Chunk.CHUNK_SIZE)) / Chunk.CHUNK_SIZE));
    }
}
