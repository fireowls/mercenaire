package fr.fireowls.apigame.item.equipment.quiver.quivers;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.quiver.Quiver;
import fr.fireowls.apigame.item.equipment.quiver.QuiverType;

public class SmallQuiver extends Quiver implements Craftable {
    /**
     * Constructeur d'item
     */
    public SmallQuiver() {
        super(Rarity.COMMON, QuiverType.SMALLQUIVER,5);
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial() {
        return false;
    }
}
