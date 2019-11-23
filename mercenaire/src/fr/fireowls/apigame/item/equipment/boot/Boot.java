package fr.fireowls.apigame.item.equipment.boot;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Boot extends Equipment {
    protected BootType type;
    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Boot(Rarity rarity, BootType type) {
        super(EquipmentType.BOOT, rarity);
        this.type = type;
    }
}
