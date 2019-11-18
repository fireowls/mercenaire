package fr.fireowls.apigame.utils;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface Updatable {

    void create();
    void update(float delta);
    void draw(SpriteBatch batch);
    void pause();
    void resume();
    void dispose();

}
