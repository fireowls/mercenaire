package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.fireowls.apigame.craft.forge.Forge;
import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.craft.workbench.Workbench;
import fr.fireowls.apigame.craft.workbench.WorkbenchRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.equipment.armor.belt.belts.IronBelt;
import fr.fireowls.apigame.item.equipment.armor.shoulderpad.shoulderpads.IronShoulderPad;
import fr.fireowls.apigame.item.equipment.purse.purses.PocketPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.SpruceToothPurse;
import fr.fireowls.apigame.item.material.MaterialType;
import fr.fireowls.apigame.item.material.materials.IronIngot;
import fr.fireowls.apigame.item.material.materials.IronOre;
import fr.fireowls.apigame.item.material.materials.Leather;
import fr.fireowls.apigame.item.material.materials.Stone;
import fr.fireowls.apigame.item.material.materials.Wood;
import fr.fireowls.apigame.item.utils.HasMaterial;
import fr.fireowls.apigame.money.Purse;
import fr.fireowls.apigame.utils.textures.SpriteSheet;

import java.io.File;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import fr.fireowls.mercenaire.scene.ScreenManager;
import fr.fireowls.mercenaire.scene.Screens;

public class Mercenaire extends ApplicationAdapter {

	private Camera camera;
	private Viewport viewport;

	private SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch()
		screenManager = new ScreenManager();

		camera = new OrthographicCamera();
		viewport = new FitViewport(1024, 720, camera);

		screenManager.create();
		screenManager.loadScene(Screens.GAME_SCREEN);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		float delta = Gdx.graphics.getDeltaTime();

		screenManager.update(delta);

		batch.begin();
		screenManager.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}



}
