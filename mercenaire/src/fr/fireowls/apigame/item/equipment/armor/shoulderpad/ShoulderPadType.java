package fr.fireowls.apigame.item.equipment.armor.shoulderpad;

import fr.fireowls.apigame.item.equipment.armor.shoulderpad.shoulderpads.*;

public enum ShoulderPadType {
    LEATHERSHOULDERPAD(LeatherShoulderPad.class),
    IRONSHOULDERPAD(IronShoulderPad.class);

    private Class<? extends ShoulderPad> c;

    private ShoulderPadType(Class<? extends ShoulderPad> c){
        this.c = c;
    }

    public Class<? extends ShoulderPad> getShoulderPadClass() {
        return c;
    }
}
