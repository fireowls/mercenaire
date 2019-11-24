package fr.fireowls.apigame.item.equipment.armor.belt.belts;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.armor.belt.Belt;
import fr.fireowls.apigame.item.equipment.armor.belt.BeltType;

public class IronBelt extends Belt implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronBelt() {
        super(Rarity.UNCOMMON, BeltType.IRONBELT);
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
