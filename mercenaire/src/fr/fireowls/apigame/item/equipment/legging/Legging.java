package fr.fireowls.apigame.item.equipment.legging;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Legging extends Equipment {

    protected LeggingType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Legging(Rarity rarity,LeggingType type) {
        super(EquipmentType.LEGGING, rarity);
        this.type = type;
    }
}
