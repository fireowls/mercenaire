package fr.fireowls.apigame.item.material;

import fr.fireowls.apigame.item.material.materials.*;

public enum MaterialType {
    STONE(999, Stone.class),
    WOOD(999, Wood.class),
    STICK(999, Stick.class),
    LEATHER(999, Leather.class),
    COAL(999,Coal.class),
    IRONORE(999,IronOre.class),
    IRONINGOT(999,IronIngot.class),
    TIGERCLAW(100, TigerClaw.class),
    TIGERSKIN(100, TigerSkin.class),
    TIGERTOOTH(100, TigerTooth.class);

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
