package fr.fireowls.apigame.item.consumable.drink.drinks;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.drink.DrinkType;

public class SimpleBeer extends Drink implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable
     *
     * @param rarity est la rareté de l'item
     * @param type
     * @param amount
     * @param meta
     */
    public SimpleBeer(int amount) {
        super(Rarity.RARE, DrinkType.SIMPLEBEER, amount, new ItemMeta("simpleBeer.json"));
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
