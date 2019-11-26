package fr.fireowls.apigame.item.equipment.jewlery.ring;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.equipment.jewlery.Jewlery;
import fr.fireowls.apigame.item.equipment.jewlery.JewleryType;

public class Ring extends Jewlery {

    protected RingType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Ring(Rarity rarity,RingType type, ItemMeta meta) {
        super(JewleryType.RING, rarity,meta);
        this.type = type;
    }
}
