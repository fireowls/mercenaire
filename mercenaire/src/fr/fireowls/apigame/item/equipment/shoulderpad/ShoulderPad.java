package fr.fireowls.apigame.item.equipment.shoulderpad;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class ShoulderPad extends Equipment {

    protected ShoulderPadType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public ShoulderPad(Rarity rarity,ShoulderPadType type) {
        super(EquipmentType.SHOULDERPAD, rarity);
        this.type = type;
    }
}
