package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.Entity;
import fr.fireowls.apigame.entity.Player;
import fr.fireowls.apigame.entity.type.EntityType;
import fr.fireowls.apigame.entity.type.movable.Direction;
import fr.fireowls.apigame.entity.type.movable.MovableEntity;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.generator.WorldCreator;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;

	World world;
	Player entity;

	@Override
	public void create () {
		batch = new SpriteBatch();
		world = new WorldCreator("test").generate();
		world.create();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			entity.move(Direction.EST);
		} else

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			entity.move(Direction.WEST);
		} else {
			entity.move(Direction.STATIC);
		}

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
