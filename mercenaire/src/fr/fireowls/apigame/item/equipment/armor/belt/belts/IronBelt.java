package fr.fireowls.apigame.item.equipment.armor.belt.belts;

import fr.fireowls.apigame.craft.forge.ForgeRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.belt.Belt;
import fr.fireowls.apigame.item.equipment.armor.belt.BeltType;
import fr.fireowls.apigame.item.utils.HasMaterial;

public class IronBelt extends Belt implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronBelt() {
        super(Rarity.UNCOMMON, BeltType.IRONBELT,new ItemMeta("ironBelt.json"));
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

    @Override
    public int getMarchandPrice() {
        return 0;
    }
}
