package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.world.generator.Grid;
import fr.fireowls.apigame.world.generator.noise.PerlinNoise;
import fr.fireowls.apigame.world.generator.noise.WhiteNoise;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;
	private Texture noiseTexture;

	Grid grid;
	double octave = 15;
	@Override
	public void create () {
		batch = new SpriteBatch();
		grid = new Grid(500);
		/*
		grid.applyNoise(new WhiteNoise());
		grid.applyNoise(new PerlinNoise((int) octave));
		if (noiseTexture != null)
			noiseTexture.dispose();
		noiseTexture = new Texture(grid.createImage("./textures/noise").getPath());
		*/
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		grid = new Grid(500);
		grid.applyNoise(new WhiteNoise());
		grid.applyNoise(new PerlinNoise((int) octave));
		if (noiseTexture != null)
			noiseTexture.dispose();
		noiseTexture = new Texture(grid.createImage("./textures/noise").getPath());
		batch.begin();
		batch.draw(noiseTexture, 0, 0);
		batch.end();
		octave = octave - 0.05  > 1 ? octave - 0.05 : 1;
	}
	
	@Override
	public void dispose () {
		noiseTexture.dispose();
		batch.dispose();
	}



}
