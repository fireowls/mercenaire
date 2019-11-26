package fr.fireowls.apigame.item.consumable.food;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.consumable.Consume;
import fr.fireowls.apigame.item.consumable.ConsumeType;

import java.lang.reflect.InvocationTargetException;

public class Food extends Consume {

    protected FoodType type;
    protected int amount;
    protected final int MAXSTACK;

    /**
     * Constructeur d'un consommable
     *
     * @param rarity est la rareté de l'item
     */
    public Food(Rarity rarity,FoodType type,int amount, ItemMeta meta) {
        super(rarity, ConsumeType.FOOD,meta);
        this.type = type;
        this.amount = amount;
        this.MAXSTACK = type.getMaxStack();
    }

    public int getAmount() {
        return amount;
    }

    public int placeLeft(){
        return MAXSTACK - amount;
    }

    @Override
    public void consume() {
        try {
            type.getFoodClass().getConstructor().newInstance().consume();
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
