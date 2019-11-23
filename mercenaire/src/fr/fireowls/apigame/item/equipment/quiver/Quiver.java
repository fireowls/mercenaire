package fr.fireowls.apigame.item.equipment.quiver;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public class Quiver extends Equipment {

    protected QuiverType type;
    protected int slot;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Quiver(Rarity rarity,QuiverType type,int slot) {
        super(EquipmentType.QUIVER, rarity);
        this.type = type;
        this.slot = slot;
    }
}
