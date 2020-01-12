package fr.fireowls.apigame.item.consumable.food.foods;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.consumable.food.Food;
import fr.fireowls.apigame.item.consumable.food.FoodType;

public class CookedFish extends Food implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable
     */
    public CookedFish() {
        super(Rarity.COMMON, FoodType.COOKEDFISH,new ItemMeta("cookedFish.json"));
    }

    @Override
    public void consume() {

    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }
}
