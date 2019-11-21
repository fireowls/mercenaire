package fr.fireowls.apigame.utils.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

@FunctionalInterface
public interface OnDraw {
    void handle(SpriteBatch batch);
}
