package fr.fireowls.apigame.item.equipment;

import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.ItemType;
import fr.fireowls.apigame.item.attribut.Rarity;

public abstract class Equipment extends Item {

    protected EquipmentType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Equipment(EquipmentType type,Rarity rarity, ItemMeta meta) {
        super(ItemType.EQUIPMENT, rarity,meta);
        this.type = type;
    }
}
