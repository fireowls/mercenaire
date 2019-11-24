package fr.fireowls.apigame.item.equipment.armor;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Armor extends Equipment {

    protected ArmorType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Armor(ArmorType type, Rarity rarity) {
        super(EquipmentType.ARMOR, rarity);
        this.type = type;
    }
}
