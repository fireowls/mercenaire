package fr.fireowls.apigame.item.equipment.boot;

import fr.fireowls.apigame.item.equipment.boot.boots.LeatherBoot;

public enum BootType {
    LEATHERBOOT(LeatherBoot.class);

    private Class<? extends Boot> c;

    private BootType(Class<? extends Boot> c){
        this.c = c;
    }

    public Class<? extends Boot> getBootClass() {
        return c;
    }
}
