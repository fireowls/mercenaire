package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.world.chunk.Chunk;

import java.io.File;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;
	private Chunk chunk;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		chunk = new Chunk(new File("worlds/myworld/chunks/chunk_0-0.json"));
		chunk.create();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		chunk.update(Gdx.graphics.getDeltaTime());
		batch.begin();
		chunk.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		chunk.dispose();
		batch.dispose();
	}
}
