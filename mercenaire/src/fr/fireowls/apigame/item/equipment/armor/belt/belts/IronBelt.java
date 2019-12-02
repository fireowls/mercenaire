package fr.fireowls.apigame.item.equipment.armor.belt.belts;

import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.equipment.armor.belt.Belt;
import fr.fireowls.apigame.item.equipment.armor.belt.BeltType;

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
