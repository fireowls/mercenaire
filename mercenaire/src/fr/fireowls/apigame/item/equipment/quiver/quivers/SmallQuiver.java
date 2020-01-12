package fr.fireowls.apigame.item.equipment.quiver.quivers;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.quiver.Quiver;
import fr.fireowls.apigame.item.equipment.quiver.QuiverType;

public class SmallQuiver extends Quiver implements Craftable {
    /**
     * Constructeur d'item
     */
    public SmallQuiver() {
        super(Rarity.COMMON, QuiverType.SMALLQUIVER,5,new ItemMeta("smallQuiver.json"));
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 20;
    }

}
