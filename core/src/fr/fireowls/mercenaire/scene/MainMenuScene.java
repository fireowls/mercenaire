package fr.fireowls.mercenaire.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.textures.SpriteSheet;

public class MainMenuScene extends Scene {

    SpriteSheet spriteSheet;

    @Override
    public void create() {
        spriteSheet = new SpriteSheet("textures/tiles/grass");
        spriteSheet.create();
    }

    @Override
    public void update(float delta) {
        spriteSheet.update(delta);
    }

    @Override
    public void draw(SpriteBatch batch) {
        spriteSheet.draw(batch);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        spriteSheet.dispose();
    }
}
