package fr.fireowls.apigame.item.tool.axe;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public class Axe extends Tool {

    protected AxeType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Axe(AxeType type,Rarity rarity) {
        super(ToolType.AXE, rarity);
    }
}
