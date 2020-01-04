package fr.fireowls.apigame.item.consumable.drink.drinks;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.consumable.drink.Drink;
import fr.fireowls.apigame.item.consumable.drink.DrinkType;

public class Potion extends Drink implements Craftable,Sellable {
    /**
     * Constructeur d'un consommable
     */
    public Potion(int amount) {
        super(Rarity.COMMON,DrinkType.POTION,amount,new ItemMeta("potion.json"));
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
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return type.getMaxStack();
    }
}
