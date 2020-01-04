package fr.fireowls.apigame.item.consumable.food.foods;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
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
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }
}
