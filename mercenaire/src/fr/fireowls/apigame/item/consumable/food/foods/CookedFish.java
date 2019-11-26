package fr.fireowls.apigame.item.consumable.food.foods;

import fr.fireowls.apigame.item.*;
import fr.fireowls.apigame.item.consumable.food.Food;
import fr.fireowls.apigame.item.consumable.food.FoodType;

public class CookedFish extends Food implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable
     * @param amount
     */
    public CookedFish(int amount) {
        super(Rarity.COMMON, FoodType.COOKEDFISH, amount,new ItemMeta("cookedFish.json"));
    }

    @Override
    public void consume() {

    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial() {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
