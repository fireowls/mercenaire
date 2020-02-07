package fr.fireowls.apigame.item.equipment.bag;

import fr.fireowls.apigame.item.equipment.bag.bags.SmallBag;

public enum BagType {
    SMALLBAG(SmallBag.class);

    private Class<? extends Bag> c;

    private BagType(Class<? extends Bag> c){
        this.c = c;
    }

    public Class<? extends Bag> getBagClass() {
        return c;
    }
}
