package fr.fireowls.apigame.utils;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Cette interface va facciliter l'implementation de différent objets dans le jeu.
 * Elle va representer leurs cicle de vie.
 */
public interface Updatable {

    /**
     * Création de l'objet. Elle doit être appelé une seul fois avant les autre methode.
     */
    void create();

    /**
     * methode appeler a chaque ticks de jeu.
     * @param delta temps en nano seconde entre maintenant et le precendant apelle de update()
     */
    void update(float delta);

    /**
     * methode appelr après update() pour afficher quelque chose
     * @param batch SpriteBatch pour afficher a quelque chose a l'ecrant
     */
    void draw(SpriteBatch batch);

    /**
     * Quand l'objet perd le focus de rendu
     */
    void pause();

    /**
     * Quand l'objet récupère le focus de rendu
     */
    void resume();

    /**
     * Quand l'objet est detruit
     */
    void dispose();

    /**
     * renvoie true si l'objets est en train d'être rendu (si la fonction update est appellé a chaque ticks)
     * @return
     */
    boolean isRendering();

}
