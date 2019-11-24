package fr.fireowls.apigame.item.equipment.jewlery;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Jewlery extends Equipment {

    protected JewleryType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Jewlery(JewleryType type, Rarity rarity) {
        super(EquipmentType.JEWLERY, rarity);
        this.type = type;
    }
}
