package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.ChunkLoader;
import fr.fireowls.apigame.utils.game.GameObject;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.chunk.ChunkPosition;
import fr.fireowls.apigame.world.generator.WorldCreator;

public class Mercenaire extends ApplicationAdapter {

	class Loader extends GameObject implements ChunkLoader {

		double x = 0;
		double y = 0;

		@Override
		public ChunkPosition getChunkPosition() {
			return new ChunkPosition((int) x, (int) y);
		}

		@Override
		protected void onCreate() {

		}

		@Override
		protected void onUpdate(float delta) {
			if (Gdx.input.isKeyPressed(Input.Keys.D))
				x+=1;
			if (Gdx.input.isKeyJustPressed(Input.Keys.Q))
				x-=1;
			if (Gdx.input.isKeyPressed(Input.Keys.Z))
				y+=1;
			if (Gdx.input.isKeyPressed(Input.Keys.S))
				y-=1;
		}

		@Override
		protected void onDraw(SpriteBatch batch) {

		}

		@Override
		protected void onPause() {

		}

		@Override
		protected void onResume() {

		}

		@Override
		protected void onDispose() {

		}
	}

	private SpriteBatch batch;

	World world;
	Loader loader = new Loader();

	@Override
	public void create () {
		batch = new SpriteBatch();
		world = new WorldCreator("test").generate();
		world.create();
		world.getGenerator().addChunkLoader(loader);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		world.update(Gdx.graphics.getDeltaTime());

		loader.update(Gdx.graphics.getDeltaTime());

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
