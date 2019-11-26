package fr.fireowls.apigame.item.tool;

import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.ItemType;
import fr.fireowls.apigame.item.Rarity;

public class Tool extends Item {

    protected ToolType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Tool(ToolType type,Rarity rarity, ItemMeta meta) {
        super(ItemType.TOOL, rarity,meta);
        this.type = type;
    }
}
