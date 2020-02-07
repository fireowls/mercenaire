package fr.fireowls.apigame.craft;

import fr.fireowls.apigame.craft.forge.Forge;
import fr.fireowls.apigame.craft.workbench.Workbench;

public enum CraftingTableType {
    FORGE(Forge.class),
    //FURNACE(),
    //JEWLERYTABLE(),
   // WINDMIRL(),
   // CAMPFIRE(),
   // BREWINGSTATION(),
   // CARPENTRYTABLE(),
    WORKBENCH(Workbench.class);

    private Class<? extends CraftingTable> c;

    private CraftingTableType(Class<? extends CraftingTable> c){
        this.c = c;
    }

    public Class<? extends CraftingTable> getC() {
        return c;
    }
}
