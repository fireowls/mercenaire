package fr.fireowls.apigame.item.consumable.drink;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.consumable.Consume;
import fr.fireowls.apigame.item.consumable.ConsumeType;

import java.lang.reflect.InvocationTargetException;

public class Drink extends Consume {

    protected DrinkType type;
    protected int amount;
    protected final int MAXSTACK;

    /**
     * Constructeur d'un consommable
     *
     * @param rarity est la rareté de l'item
     */
    public Drink(Rarity rarity,DrinkType type, int amount) {
        super(rarity, ConsumeType.DRINK);
        this.type = type;
        this.amount = amount;
        this.MAXSTACK = type.getMaxStack();
    }

    public int getAmount(){
        return amount;
    }

    public int placeLeft(){
        return MAXSTACK - amount;
    }

    @Override
    public void consume() {
        try {
            type.getDrinkClass().getConstructor().newInstance().consume();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
