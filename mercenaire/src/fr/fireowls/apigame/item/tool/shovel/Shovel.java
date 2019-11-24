package fr.fireowls.apigame.item.tool.shovel;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public class Shovel extends Tool {

    protected ShovelType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Shovel(ShovelType type, Rarity rarity) {
        super(ToolType.SHOVEL, rarity);
        this.type = type;
    }
}
