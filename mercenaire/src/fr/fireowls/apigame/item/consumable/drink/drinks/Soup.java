package fr.fireowls.apigame.item.consumable.drink.drinks;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.drink.DrinkType;

public class Soup extends Drink implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable
     * @param amount
     */
    public Soup() {
        super(Rarity.COMMON, DrinkType.SOUP,new ItemMeta("soup.json"));
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
