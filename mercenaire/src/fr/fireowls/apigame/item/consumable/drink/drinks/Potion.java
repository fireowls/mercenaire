package fr.fireowls.apigame.item.consumable.drink.drinks;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.drink.DrinkType;

public class Potion extends Drink implements Craftable,Sellable {
    /**
     * Constructeur d'un consommable
     */
    public Potion(int amount) {
        super(Rarity.COMMON,DrinkType.POTION,amount);
    }

    @Override
    public void consume() {

    }

    @Override
    public void sell() {

    }

    @Override
    public double getPrice() {
        return 20 * super.amount;
    }

    @Override
    public void craft() {

    }

    @Override
    public boolean hasMaterial() {
        return false;
    }
}
