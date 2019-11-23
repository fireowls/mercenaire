package fr.fireowls.apigame.item.material;

import fr.fireowls.apigame.item.material.mat.*;

public enum MaterialType {
    STONE(999, Stone.class),
    WOOD(999, Wood.class);

    private int maxStack;
    private Class<? extends Material> c;

    private MaterialType(int m,Class<? extends Material> c){
        this.maxStack = m;
        this.c = c;
    }

    public int getMaxStack(){
        return maxStack;
    }

    public Class<? extends Material> getMatClass(){
        return c;
    }
}
