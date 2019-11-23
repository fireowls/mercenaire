package fr.fireowls.apigame.item.equipment;

import fr.fireowls.apigame.item.equipment.bag.Bag;
import fr.fireowls.apigame.item.equipment.belt.Belt;
import fr.fireowls.apigame.item.equipment.boot.Boot;
import fr.fireowls.apigame.item.equipment.chestplate.Chestplate;
import fr.fireowls.apigame.item.equipment.glove.Glove;
import fr.fireowls.apigame.item.equipment.helmet.Helmet;
import fr.fireowls.apigame.item.equipment.legging.Legging;
import fr.fireowls.apigame.item.equipment.necklace.Necklace;
import fr.fireowls.apigame.item.equipment.quiver.Quiver;
import fr.fireowls.apigame.item.equipment.ring.Ring;
import fr.fireowls.apigame.item.equipment.shoulderpad.ShoulderPad;

public enum EquipmentType {
    HELMET(Helmet.class),
    CHESTPLATE(Chestplate.class),
    LEGGING(Legging.class),
    BOOT(Boot.class),
    BELT(Belt.class),
    SHOULDERPAD(ShoulderPad.class),
    GLOVE(Glove.class),
    RING(Ring.class),
    NECKLACE(Necklace.class),
    BAG(Bag.class),
    QUIVER(Quiver.class);

    private Class<? extends Equipment> c;

    private EquipmentType(Class<? extends Equipment> c){
        this.c = c;
    }

    public Class<? extends Equipment> getEquipClass() {
        return c;
    }
}
