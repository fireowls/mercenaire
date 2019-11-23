package fr.fireowls.apigame.item.equipment.ring;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Ring extends Equipment {

    protected RingType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Ring(Rarity rarity,RingType type) {
        super(EquipmentType.RING, rarity);
        this.type = type;
    }
}
