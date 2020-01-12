package fr.fireowls.apigame.item.consumable.food;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.consumable.Consume;
import fr.fireowls.apigame.item.consumable.ConsumeType;

import java.lang.reflect.InvocationTargetException;

public abstract class Food extends Consume {

    protected FoodType type;
    protected final int MAXSTACK;

    /**
     * Constructeur d'un consommable
     *
     * @param rarity est la rareté de l'item
     */
    public Food(Rarity rarity,FoodType type, ItemMeta meta) {
        super(rarity, ConsumeType.FOOD,meta);
        this.type = type;
        this.MAXSTACK = type.getMaxStack();
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
