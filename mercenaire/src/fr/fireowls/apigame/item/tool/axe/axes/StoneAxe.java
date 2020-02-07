package fr.fireowls.apigame.item.tool.axe.axes;

import fr.fireowls.apigame.craft.workbench.WorkbenchRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.tool.axe.Axe;
import fr.fireowls.apigame.item.tool.axe.AxeType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class StoneAxe extends Axe implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StoneAxe() {
        super(AxeType.STONEAXE, Rarity.COMMON,new ItemMeta("stoneAxe.json"));
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
        return 10;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getMarchandPrice() {
        return 0;
    }
}
