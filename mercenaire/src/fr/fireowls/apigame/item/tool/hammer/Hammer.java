package fr.fireowls.apigame.item.tool.hammer;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public abstract class Hammer extends Tool {

    protected HammerType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Hammer(HammerType type, Rarity rarity, ItemMeta meta) {
        super(ToolType.HAMMER, rarity,meta);
        this.type = type;
    }
}
