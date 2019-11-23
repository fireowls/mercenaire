package fr.fireowls.apigame.item.equipment.necklace;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Necklace extends Equipment {

    protected NecklaceType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Necklace(Rarity rarity, NecklaceType type) {
        super(EquipmentType.NECKLACE, rarity);
        this.type = type;
    }
}
