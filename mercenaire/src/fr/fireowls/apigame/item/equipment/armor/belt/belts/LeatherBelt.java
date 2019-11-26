package fr.fireowls.apigame.item.equipment.armor.belt.belts;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
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
    public boolean hasMaterial() {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 20;
    }
}
