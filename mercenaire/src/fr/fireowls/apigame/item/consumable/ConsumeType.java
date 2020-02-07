package fr.fireowls.apigame.item.consumable;

import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.food.Food;

public enum ConsumeType {

    FOOD(Food.class),
    DRINK(Drink.class);

    private Class<? extends Consume> c;

    private ConsumeType(Class<? extends Consume> c){
        this.c = c;
    }

    public Class<? extends Consume> getConsClass(){
        return c;
    }
}
