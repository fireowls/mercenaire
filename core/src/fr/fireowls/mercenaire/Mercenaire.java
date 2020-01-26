package fr.fireowls.mercenaire;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
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

public class Mercenaire extends ApplicationAdapter {

	private SpriteBatch batch;
	private SpriteSheet sheet;


	@Override
	public void create () {
		batch = new SpriteBatch();
		sheet = new SpriteSheet(new File("textures/tiles/grass"));

		Inventory inv = new Inventory();
		Item stone = new Stone();
		Item wood = new Wood();
		Item pocket = new PocketPurse();

		inv.put(1000,wood);
		inv.put(1,pocket);

		inv.showInventory();

		Purse pusre = new Purse(new SpruceToothPurse());
		pusre.showMoney();
		pusre.sellAllItem(inv);

		inv.showInventory();
		pusre.showMoney();

		pusre.buyItem(stone,500,inv);

		inv.showInventory();
		pusre.showMoney();

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
