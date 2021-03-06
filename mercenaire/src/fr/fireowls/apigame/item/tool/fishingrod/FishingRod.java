package fr.fireowls.apigame.item.tool.fishingrod;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public abstract class FishingRod extends Tool {

    protected FishingRodType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public FishingRod(FishingRodType type, Rarity rarity, ItemMeta meta) {
        super(ToolType.FISHINGROD, rarity,meta);
        this.type = type;
    }
}
