package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.fireowls.apigame.craft.forge.Forge;
import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.material.MaterialType;
import fr.fireowls.apigame.item.material.materials.IronIngot;
import fr.fireowls.apigame.item.material.materials.IronOre;
import fr.fireowls.apigame.item.material.materials.Stone;
import fr.fireowls.apigame.item.material.materials.Wood;
import fr.fireowls.apigame.item.utils.HasMaterial;
import fr.fireowls.apigame.utils.textures.SpriteSheet;

import java.io.File;

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;
	private SpriteSheet sheet;


	@Override
	public void create () {
		batch = new SpriteBatch();
		sheet = new SpriteSheet(new File("textures/tiles/grass"));

		Inventory inv = new Inventory();
		Item ironOre = new IronOre(0);
		Item ironIngot = new IronIngot(0);

		inv.put(20,ironOre);

		Forge forge = new Forge();

		forge.craft(ForgeRecipe.IRONINGOT,inv,5);

		inv.put(40,ironIngot);

		forge.craft(ForgeRecipe.STEELINGOT,inv,10);

		inv.showInventory();

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
