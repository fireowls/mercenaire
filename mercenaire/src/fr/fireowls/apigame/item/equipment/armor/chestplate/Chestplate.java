package fr.fireowls.apigame.item.equipment.armor.chestplate;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public abstract class Chestplate extends Armor {

    protected ChestplateType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Chestplate(Rarity rarity,ChestplateType type, ItemMeta meta) {
        super(ArmorType.CHESTPLATE, rarity,meta);
        this.type = type;
    }
}
