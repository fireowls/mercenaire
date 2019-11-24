package fr.fireowls.apigame.item.equipment.armor.chestplate;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public class Chestplate extends Armor {

    protected ChestplateType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Chestplate(Rarity rarity,ChestplateType type) {
        super(ArmorType.CHESTPLATE, rarity);
        this.type = type;
    }
}
