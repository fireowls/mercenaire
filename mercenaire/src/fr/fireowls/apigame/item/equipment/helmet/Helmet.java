package fr.fireowls.apigame.item.equipment.helmet;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Helmet extends Equipment {

    protected HelmetType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Helmet(Rarity rarity,HelmetType type) {
        super(EquipmentType.HELMET, rarity);
        this.type = type;
    }
}
