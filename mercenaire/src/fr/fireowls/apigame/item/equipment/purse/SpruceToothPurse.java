package fr.fireowls.apigame.item.equipment.purse;

import fr.fireowls.apigame.craft.workbench.WorkbenchRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class SpruceToothPurse extends PurseItem implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public SpruceToothPurse() {
        super(PurseItemType.SPRUCETOOTH, Rarity.LEGENDARY, new ItemMeta("sprucetoothPurse.json"));
    }

    @Override
    public boolean hasMaterial(Inventory inv, int nb) {
        return HasMaterial.hasMat(WorkbenchRecipe.getItemRecipe(this.getClass()),inv,nb);
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void craft() {

    }

    @Override
    public void sell() {

    }
}
