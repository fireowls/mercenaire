package fr.fireowls.apigame.item.tool.hoe;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public abstract class Hoe extends Tool {

    protected HoeType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Hoe(HoeType type, Rarity rarity, ItemMeta meta) {
        super(ToolType.HOE, rarity,meta);
        this.type = type;
    }
}
