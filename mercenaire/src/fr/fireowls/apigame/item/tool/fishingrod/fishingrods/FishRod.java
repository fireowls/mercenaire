package fr.fireowls.apigame.item.tool.fishingrod.fishingrods;

import fr.fireowls.apigame.craft.workbench.Workbench;
import fr.fireowls.apigame.craft.workbench.WorkbenchRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.tool.fishingrod.FishingRod;
import fr.fireowls.apigame.item.tool.fishingrod.FishingRodType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class FishRod extends FishingRod implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public FishRod() {
        super(FishingRodType.FISHROD, Rarity.COMMON,new ItemMeta("fishRod.json"));
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
}
