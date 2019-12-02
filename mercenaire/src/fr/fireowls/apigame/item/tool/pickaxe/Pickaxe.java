package fr.fireowls.apigame.item.tool.pickaxe;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.tool.Tool;
import fr.fireowls.apigame.item.tool.ToolType;

public class Pickaxe extends Tool {

    protected PickaxeType type;

    /**
     * Constructeur d'item
     * @param rarity est la rareté de l'item
     */
    public Pickaxe(Rarity rarity,PickaxeType type, ItemMeta meta) {
        super(ToolType.PICKAXE, rarity,meta);
        this.type = type;
    }
}
