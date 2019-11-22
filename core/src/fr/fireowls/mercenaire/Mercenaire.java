package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.textures.SpriteSheet;

import java.io.File;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;
	private SpriteSheet sheet;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		sheet = new SpriteSheet(new File("textures/tiles/grass"));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sheet.update(Gdx.graphics.getDeltaTime());
		batch.begin();
		batch.draw(sheet.getTexture(), 50, 50);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
