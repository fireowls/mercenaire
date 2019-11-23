package fr.fireowls.apigame.item.tool;

import fr.fireowls.apigame.item.tool.axe.Axe;
import fr.fireowls.apigame.item.tool.pickaxe.Pickaxe;

public enum ToolType {
    PICKAXE(Pickaxe.class),
    AXE(Axe.class);

    private Class<? extends Tool> c;

    private ToolType(Class<? extends Tool> c){
        this.c = c;
    }

    public Class<? extends  Tool> getToolClass(){
        return c;
    }
}
