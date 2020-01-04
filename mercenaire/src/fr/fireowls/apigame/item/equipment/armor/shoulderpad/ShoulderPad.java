package fr.fireowls.apigame.item.equipment.armor.shoulderpad;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public abstract class ShoulderPad extends Armor {

    protected ShoulderPadType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public ShoulderPad(Rarity rarity,ShoulderPadType type, ItemMeta meta) {
        super(ArmorType.SHOULDERPAD, rarity,meta);
        this.type = type;
    }
}
