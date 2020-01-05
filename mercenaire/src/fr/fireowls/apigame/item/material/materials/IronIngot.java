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

public class IronIngot extends Material implements Craftable, Sellable {

    public IronIngot() {
        super(Rarity.UNCOMMON, MaterialType.IRONINGOT,new ItemMeta("ironIngot.json"));
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
    public double getPrice() {
        return 5;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }
}
