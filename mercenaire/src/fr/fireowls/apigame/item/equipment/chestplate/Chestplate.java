package fr.fireowls.apigame.item.equipment.chestplate;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Chestplate extends Equipment {

    protected ChestplateType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Chestplate(Rarity rarity,ChestplateType type) {
        super(EquipmentType.CHESTPLATE, rarity);
        this.type = type;
    }
}
