package fr.fireowls.apigame.item.consumable.food.foods;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.consumable.food.Food;
import fr.fireowls.apigame.item.consumable.food.FoodType;

public class Steak extends Food implements Craftable,Sellable {
    /**
     * Constructeur d'un consommable
     */
    public Steak(int amount) {
        super(Rarity.COMMON, FoodType.STEAK,amount,new ItemMeta("steak.json"));
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

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial() {
        return false;
    }
}
