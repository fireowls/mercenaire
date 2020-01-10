package fr.fireowls.apigame.item.equipment.purse;

import fr.fireowls.apigame.item.equipment.purse.purses.BigPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.GreaterPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.MediumPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.SmallPurse;

public enum PurseItemType {
    SMALL(SmallPurse.class),
    MEDIUM(MediumPurse.class),
    BIG(BigPurse.class),
    GREATER(GreaterPurse.class),
    SPRUCETOOTH(SpruceToothPurse.class);

    private Class<? extends PurseItem> c;

    private PurseItemType(Class<? extends PurseItem> c){
        this.c = c;
    }

    public Class<? extends PurseItem> getC() {
        return c;
    }
}
