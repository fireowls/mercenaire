package fr.fireowls.apigame.item.equipment.armor;

import fr.fireowls.apigame.item.equipment.armor.belt.Belt;
import fr.fireowls.apigame.item.equipment.armor.boot.Boot;
import fr.fireowls.apigame.item.equipment.armor.chestplate.Chestplate;
import fr.fireowls.apigame.item.equipment.armor.glove.Glove;
import fr.fireowls.apigame.item.equipment.armor.helmet.Helmet;
import fr.fireowls.apigame.item.equipment.armor.legging.Legging;
import fr.fireowls.apigame.item.equipment.armor.shoulderpad.ShoulderPad;

public enum ArmorType {
    HELMET(Helmet .class),
    CHESTPLATE(Chestplate .class),
    LEGGING(Legging .class),
    BOOT(Boot .class),
    BELT(Belt .class),
    SHOULDERPAD(ShoulderPad .class),
    GLOVE(Glove .class);

    private Class<? extends Armor> c;

    private ArmorType(Class<? extends Armor> c){
        this.c = c;
    }

    public Class<? extends Armor> getEquipClass() {
        return c;
    }
}
