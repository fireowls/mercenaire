package fr.fireowls.apigame.item.tool.shovel.shovels;

import fr.fireowls.apigame.craft.workbench.WorkbenchRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.tool.shovel.Shovel;
import fr.fireowls.apigame.item.tool.shovel.ShovelType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class StoneShovel extends Shovel implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StoneShovel() {
        super(ShovelType.STONESHOVEL, Rarity.COMMON,new ItemMeta("stoneShovel.json"));
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return HasMaterial.hasMat(WorkbenchRecipe.getItemRecipe(this.getClass()),inv,nb);
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
