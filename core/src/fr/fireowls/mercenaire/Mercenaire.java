package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.EntityMeta;
import fr.fireowls.apigame.entity.shape.HumanShape;
import fr.fireowls.apigame.entity.type.Player;
import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.generator.WorldCreator;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;

	World world;

	@Override
	public void create () {
		batch = new SpriteBatch();
		world = new WorldCreator("test").generate();
		world.create();
		HumanShape humanShape = new HumanShape();
		Player player = new Player(humanShape, new EntityMeta());
		player.setLocation(new Location(world, 5, 5.5));
		world.getEntityManager().addEntity(player);
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
