package fr.fireowls.apigame.item.material.materials;

import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.material.Material;
import fr.fireowls.apigame.item.material.MaterialType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class CopperIngot extends Material implements Craftable, Sellable {

    public CopperIngot() {
        super(Rarity.UNCOMMON, MaterialType.COPPERINGOT,new ItemMeta("copperIngot.json"));
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
        return 10;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }
}
