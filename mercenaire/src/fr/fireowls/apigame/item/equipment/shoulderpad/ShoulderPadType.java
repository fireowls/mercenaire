package fr.fireowls.apigame.item.equipment.shoulderpad;

import fr.fireowls.apigame.item.equipment.shoulderpad.shoulderpads.LeatherShoulderPad;

public enum ShoulderPadType {
    LEATHERSHOULDERPAD(LeatherShoulderPad.class);

    private Class<? extends ShoulderPad> c;

    private ShoulderPadType(Class<? extends ShoulderPad> c){
        this.c = c;
    }

    public Class<? extends ShoulderPad> getShoulderPadClass() {
        return c;
    }
}
