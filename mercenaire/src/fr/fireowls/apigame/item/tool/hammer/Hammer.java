package fr.fireowls.apigame.item.tool.hammer;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public class Hammer extends Tool {

    protected HammerType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Hammer(HammerType type, Rarity rarity) {
        super(ToolType.HAMMER, rarity);
        this.type = type;
    }
}
