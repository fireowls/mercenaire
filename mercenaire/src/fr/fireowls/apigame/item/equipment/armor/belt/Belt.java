package fr.fireowls.apigame.item.equipment.armor.belt;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.armor.ArmorType;

public abstract class Belt extends Armor {

    protected BeltType type;

    /**
     * Constructeur d'item
     * @param rarity est la rareté de l'item
     */
    public Belt(Rarity rarity,BeltType type, ItemMeta meta) {
        super(ArmorType.BELT, rarity,meta);
        this.type = type;
    }
}
