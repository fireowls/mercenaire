package fr.fireowls.apigame.item.equipment.belt;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Belt extends Equipment {

    protected BeltType type;

    /**
     * Constructeur d'item
     * @param rarity est la rareté de l'item
     */
    public Belt(Rarity rarity,BeltType type) {
        super(EquipmentType.BELT, rarity);
        this.type = type;
    }
}
