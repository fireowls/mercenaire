package fr.fireowls.apigame.item.equipment.armor.belt.belts;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.belt.Belt;
import fr.fireowls.apigame.item.equipment.armor.belt.BeltType;

public class LeatherBelt extends Belt implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public LeatherBelt() {
        super(Rarity.COMMON, BeltType.LEATHERBELT,new ItemMeta("leatherBelt.json"));
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 15;
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
