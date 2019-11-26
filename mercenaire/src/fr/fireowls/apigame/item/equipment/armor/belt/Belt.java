package fr.fireowls.apigame.item.equipment.armor.belt;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public class Belt extends Armor {

    protected BeltType type;

    /**
     * Constructeur d'item
     * @param rarity est la rareté de l'item
     */
    public Belt(Rarity rarity,BeltType type, ItemMeta meta) {
        super(ArmorType.BELT, rarity,meta);
        this.type = type;
    }
}
