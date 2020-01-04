package fr.fireowls.apigame.item.tool.shovel;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public abstract class Shovel extends Tool {

    protected ShovelType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Shovel(ShovelType type, Rarity rarity, ItemMeta meta) {
        super(ToolType.SHOVEL, rarity,meta);
        this.type = type;
    }
}
