package fr.fireowls.apigame.item.equipment.armor.legging.leggings;

import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.legging.Legging;
import fr.fireowls.apigame.item.equipment.armor.legging.LeggingType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class IronLegging extends Legging implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronLegging() {
        super(Rarity.UNCOMMON, LeggingType.IRONLEGGING,new ItemMeta("ironLegging.json"));
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
        return 25;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }
}
