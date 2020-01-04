package fr.fireowls.apigame.craft;

public enum CraftingTableType {
    FORGE(),
    FURNACE(),
    JEWLERYTABLE(),
    WINDMIRL(),
    CAMPFIRE(),
    BREWINGSTATION(),
    CARPENTRYTABLE();

    private Class<? extends CraftingTable> c;

    private CraftingTableType(){

    }

    public Class<? extends CraftingTable> getC() {
        return c;
    }
}
