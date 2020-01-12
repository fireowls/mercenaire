package fr.fireowls.apigame.item.consumable.drink.drinks;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.drink.DrinkType;

public class SimpleBeer extends Drink implements Craftable, Sellable {
    /**
     * Constructeur d'un consommable

     */
    public SimpleBeer() {
        super(Rarity.RARE, DrinkType.SIMPLEBEER, new ItemMeta("simpleBeer.json"));
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

    @Override
    public void consume() {

    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return 5;
    }
}
