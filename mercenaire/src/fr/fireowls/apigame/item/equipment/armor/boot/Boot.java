package fr.fireowls.apigame.item.equipment.armor.boot;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public class Boot extends Armor {
    protected BootType type;
    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Boot(Rarity rarity, BootType type) {
        super(ArmorType.BOOT, rarity);
        this.type = type;
    }
}
