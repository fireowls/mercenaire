package fr.fireowls.apigame.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Updatable;
import fr.fireowls.apigame.world.chunk.Chunk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represente un monde avec sont fichier, son nom, sa liste de chunks, ect...
 */
public class World implements Updatable {

    private String name;
    private List<Chunk> chunks;
    private File file;

    private boolean loaded = false;

    /**
     * Créer une nouvelle instance de monde avec pour nom "world"
     */
    public World() {
        this("world");
    }

    /**
     * Créer une nouvelle instance de monde
     * @param name le nom du monde
     */
    public World(String name) {
        this.chunks = new ArrayList<>();
        this.name = name;
    }

    /**
     * Creer et load le monde
     */
    @Override
    public void create() {
        loaded = true;
    }

    /**
     * update le monde est tout les composant du monde
     * @param delta temps en nano seconde entre maintenant et le precendant apelle de update()
     */
    @Override
    public void update(float delta) {

    }

    /**
     * Afficher le monde
     * @param batch SpriteBatch pour afficher a quelque chose a l'ecrant
     */
    @Override
    public void draw(SpriteBatch batch) {

    }

    /**
     * laisser le monde de coté
     */
    @Override
    public void pause() {
        loaded = false;
    }

    /**
     * redonner le focus au monde
     */
    @Override
    public void resume() {
        loaded = true;
    }

    /**
     * Stop le rendu du monde
     */
    @Override
    public void dispose() {
        loaded = false;
    }

    /**
     * Détermine si le monde est en train d'être rendu
     * @return
     */
    @Override
    public boolean isRendering() {
        return loaded;
    }

    /**
     * obtenir la liste des chunks
     * @return
     */
    public List<Chunk> getChunks() {
        return chunks;
    }

    /**
     * ajouter un chunk a la liste
     * @param chunk
     */
    public void addChunk(Chunk chunk) {
        this.chunks.add(chunk);
    }

    /**
     * retirer un chunk a la liste
     * @param chunk
     */
    public void removeChunk(Chunk chunk) {
        this.chunks.remove(chunk);
    }

    /**
     *
     * @return le dossier ou sont stocké les données du monde
     */
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    /**
     * le nom du monde
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
