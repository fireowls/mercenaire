package fr.fireowls.apigame.item.equipment.armor.glove;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public abstract class Glove extends Armor {

    protected GloveType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Glove(Rarity rarity,GloveType type, ItemMeta meta) {
        super(ArmorType.GLOVE, rarity,meta);
        this.type = type;
    }
}
