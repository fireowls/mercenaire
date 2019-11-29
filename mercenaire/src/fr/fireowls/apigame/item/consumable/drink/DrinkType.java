package fr.fireowls.apigame.item.consumable.drink;

import fr.fireowls.apigame.item.consumable.drink.drinks.*;

public enum DrinkType {
    POTION(100, Potion.class),
    SOUP(100,Soup.class),
    SIMPLEBEER(100,SimpleBeer.class);

    private int maxStack;
    private Class<? extends Drink> c;

    private DrinkType(int m,Class<? extends Drink> c){
        this.maxStack = m;
        this.c = c;
    }

    public int getMaxStack(){
        return maxStack;
    }

    public Class<? extends Drink> getDrinkClass(){
        return c;
    }
}
