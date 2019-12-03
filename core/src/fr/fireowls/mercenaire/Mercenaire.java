package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.ChunkLoader;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.chunk.ChunkPosition;
import fr.fireowls.apigame.world.generator.Grid;
import fr.fireowls.apigame.world.generator.WorldCreator;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;

	World world;

	@Override
	public void create () {
		batch = new SpriteBatch();
		world = new WorldCreator("test").generate();
		world.create();
		world.getGenerator().addChunkLoader(new ChunkLoader() {
			@Override
			public ChunkPosition getChunkPosition() {
				return new ChunkPosition(0, 0);
			}
		});
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		world.update(Gdx.graphics.getDeltaTime());

		batch.begin();
		world.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		world.dispose();
	}



}
