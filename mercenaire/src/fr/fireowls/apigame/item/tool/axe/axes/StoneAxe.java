package fr.fireowls.apigame.item.tool.axe.axes;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.tool.axe.Axe;
import fr.fireowls.apigame.item.tool.axe.AxeType;

public class StoneAxe extends Axe implements Craftable, Sellable {
    /**
     * Constructeur d'item
     */
    public StoneAxe() {
        super(AxeType.STONEAXE, Rarity.COMMON);
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
        return 15;
    }
}
