package fr.fireowls.apigame.item.tool;

import fr.fireowls.apigame.item.tool.axe.Axe;
import fr.fireowls.apigame.item.tool.fishingrod.FishingRod;
import fr.fireowls.apigame.item.tool.hammer.Hammer;
import fr.fireowls.apigame.item.tool.hoe.Hoe;
import fr.fireowls.apigame.item.tool.pickaxe.Pickaxe;
import fr.fireowls.apigame.item.tool.shovel.Shovel;

public enum ToolType {
    PICKAXE(Pickaxe.class),
    AXE(Axe.class),
    SHOVEL(Shovel.class),
    FISHINGROD(FishingRod.class),
    HAMMER(Hammer.class),
    HOE(Hoe.class);

    private Class<? extends Tool> c;

    private ToolType(Class<? extends Tool> c){
        this.c = c;
    }

    public Class<? extends  Tool> getToolClass(){
        return c;
    }
}
