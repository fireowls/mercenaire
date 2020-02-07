package fr.fireowls.apigame.item.tool.pickaxe;

import fr.fireowls.apigame.item.tool.pickaxe.pickaxes.StonePick;

public enum PickaxeType {
    STONEPICK(StonePick.class);

    private Class<? extends Pickaxe> c;

    private PickaxeType(Class<? extends Pickaxe> c){
        this.c = c;
    }

    public Class<? extends Pickaxe> getPickClass(){
        return c;
    }
}
