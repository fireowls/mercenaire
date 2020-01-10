package fr.fireowls.apigame.item.equipment.armor.chestplate.chestplates;

import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.chestplate.Chestplate;
import fr.fireowls.apigame.item.equipment.armor.chestplate.ChestplateType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class IronChestplate extends Chestplate implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronChestplate() {
        super(Rarity.UNCOMMON, ChestplateType.IRONCHESTPLATE,new ItemMeta("ironChestplate.json"));
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return HasMaterial.hasMat(ForgeRecipe.getItemRecipe(this.getClass()),inv,nb);
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
