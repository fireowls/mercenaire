package fr.fireowls.apigame.item.equipment.armor.boot.boots;

import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.boot.Boot;
import fr.fireowls.apigame.item.equipment.armor.boot.BootType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class IronBoot extends Boot implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronBoot() {
        super(Rarity.UNCOMMON, BootType.IRONBOOT,new ItemMeta("ironBoot.json"));
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
