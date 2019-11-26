package fr.fireowls.apigame.item.equipment.armor.legging;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public class Legging extends Armor {

    protected LeggingType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Legging(Rarity rarity,LeggingType type, ItemMeta meta) {
        super(ArmorType.LEGGING, rarity,meta);
        this.type = type;
    }
}
