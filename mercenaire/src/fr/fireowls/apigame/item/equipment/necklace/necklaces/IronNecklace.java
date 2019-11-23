package fr.fireowls.apigame.item.equipment.necklace.necklaces;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.equipment.necklace.Necklace;
import fr.fireowls.apigame.item.equipment.necklace.NecklaceType;

public class IronNecklace extends Necklace implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public IronNecklace() {
        super(Rarity.UNCOMMON, NecklaceType.IRONNECKLACE);
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
        return 50;
    }
}
