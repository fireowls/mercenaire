package fr.fireowls.apigame.item.tool.fishingrod;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public class FishingRod extends Tool {

    protected FishingRodType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public FishingRod(FishingRodType type, Rarity rarity) {
        super(ToolType.FISHINGROD, rarity);
        this.type = type;
    }
}
