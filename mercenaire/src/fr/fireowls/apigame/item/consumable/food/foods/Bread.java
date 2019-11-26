package fr.fireowls.apigame.item.consumable.food.foods;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.consumable.food.Food;
import fr.fireowls.apigame.item.consumable.food.FoodType;

public class Bread extends Food implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable
     * @param amount
     */
    public Bread(int amount) {
        super(Rarity.COMMON, FoodType.BREAD, amount,new ItemMeta("bread.json"));
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
