package fr.fireowls.apigame.item.consumable.food.foods;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.consumable.food.Food;
import fr.fireowls.apigame.item.consumable.food.FoodType;

public class Steak extends Food implements Sellable {
    /**
     * Constructeur d'un consommable
     */
    public Steak(int amount) {
        super(Rarity.COMMON, FoodType.STEAK,amount);
    }

    @Override
    public void consume() {

    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 5 * super.amount;
    }
}
