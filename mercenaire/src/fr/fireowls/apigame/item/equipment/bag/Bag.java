package fr.fireowls.apigame.item.equipment.bag;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;

public abstract class Bag extends Equipment {

    protected BagType type;
    protected int capacity;

    /**
     * Constructeur d'item
     * @param rarity est la rareté de l'item
     */
    public Bag(Rarity rarity,BagType type,int capacity, ItemMeta meta) {
        super(EquipmentType.BAG, rarity,meta);
        this.type = type;
        this.capacity = capacity;
    }

    protected int getCapacity(){
        return capacity;
    }
}
