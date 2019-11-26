package fr.fireowls.apigame.item.consumable.food;

import fr.fireowls.apigame.item.consumable.food.foods.*;

public enum FoodType {
    STEAK(100, Steak.class),
    COOKEDFISH(100,CookedFish.class),
    BREAD(100,Bread.class);

    private int maxStack;
    private Class<? extends Food> c;

    private FoodType(int m,Class<? extends Food> c){
        this.maxStack = m;
    }

    public int getMaxStack(){
        return maxStack;
    }

    public Class<? extends Food> getFoodClass() {
        return c;
    }
}
