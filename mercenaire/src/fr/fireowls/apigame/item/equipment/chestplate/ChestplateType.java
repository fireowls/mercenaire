package fr.fireowls.apigame.item.equipment.chestplate;

import fr.fireowls.apigame.item.equipment.chestplate.chestplates.LeatherChestplate;

public enum ChestplateType {
    LEATHERCHESTPLATE(LeatherChestplate.class);

    private Class<? extends Chestplate> c;

    private ChestplateType(Class<? extends Chestplate> c){
        this.c = c;
    }

    public Class<? extends Chestplate> getChestplateClass() {
        return c;
    }
}
