package fr.fireowls.apigame.item.equipment.armor.chestplate;

import fr.fireowls.apigame.item.equipment.armor.chestplate.chestplates.*;

public enum ChestplateType {
    LEATHERCHESTPLATE(LeatherChestplate.class),
    IRONCHESTPLATE(IronChestplate.class);

    private Class<? extends Chestplate> c;

    private ChestplateType(Class<? extends Chestplate> c){
        this.c = c;
    }

    public Class<? extends Chestplate> getChestplateClass() {
        return c;
    }
}
