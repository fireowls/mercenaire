package fr.fireowls.apigame.item.equipment;

import fr.fireowls.apigame.item.equipment.armor.Armor;
import fr.fireowls.apigame.item.equipment.bag.Bag;
import fr.fireowls.apigame.item.equipment.jewlery.Jewlery;
import fr.fireowls.apigame.item.equipment.purse.PurseItem;
import fr.fireowls.apigame.item.equipment.quiver.Quiver;

public enum EquipmentType {
    ARMOR(Armor.class),
    JEWLERY(Jewlery.class),
    BAG(Bag.class),
    QUIVER(Quiver.class),
    PurseItem(PurseItem.class);

    private Class<? extends Equipment> c;

    private EquipmentType(Class<? extends Equipment> c){
        this.c = c;
    }

    public Class<? extends Equipment> getEquipClass() {
        return c;
    }
}
