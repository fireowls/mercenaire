package fr.fireowls.apigame.item.equipment.glove;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Glove extends Equipment {

    protected GloveType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Glove(Rarity rarity,GloveType type) {
        super(EquipmentType.GLOVE, rarity);
        this.type = type;
    }
}
