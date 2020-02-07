package fr.fireowls.apigame.item.equipment.armor.boot;

import fr.fireowls.apigame.item.equipment.armor.boot.boots.*;

public enum BootType {
    LEATHERBOOT(LeatherBoot.class),
    IRONBOOT(IronBoot.class);

    private Class<? extends Boot> c;

    private BootType(Class<? extends Boot> c){
        this.c = c;
    }

    public Class<? extends Boot> getBootClass() {
        return c;
    }
}
