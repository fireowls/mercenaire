package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.generator.Grid;
import fr.fireowls.apigame.world.generator.WorldCreator;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;
	private Grid grid;

	@Override
	public void create () {
		batch = new SpriteBatch();
		World world = new WorldCreator("test").generate();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}



}
