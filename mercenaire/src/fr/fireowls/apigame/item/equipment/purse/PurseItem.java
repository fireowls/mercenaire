package fr.fireowls.apigame.item.equipment.purse;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public abstract class PurseItem extends Equipment {

    protected PurseItemType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     * @param meta
     */
    public PurseItem(PurseItemType type,Rarity rarity, ItemMeta meta) {
        super(EquipmentType.PurseItem, rarity, meta);
        this.type = type;
    }
}
