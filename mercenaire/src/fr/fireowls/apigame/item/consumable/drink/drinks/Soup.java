package fr.fireowls.apigame.item.consumable.drink.drinks;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.drink.DrinkType;

public class Soup extends Drink implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable
     *
     * @param rarity est la rareté de l'item
     * @param type
     * @param amount
     */
    public Soup(int amount) {
        super(Rarity.COMMON, DrinkType.SOUP, amount,new ItemMeta("soup.json"));
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
