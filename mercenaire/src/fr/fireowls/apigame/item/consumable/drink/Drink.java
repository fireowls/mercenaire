package fr.fireowls.apigame.item.consumable.drink;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.consumable.Consume;
import fr.fireowls.apigame.item.consumable.ConsumeType;

import java.lang.reflect.InvocationTargetException;

public abstract class Drink extends Consume {

    protected DrinkType type;
    protected final int MAXSTACK;

    /**
     * Constructeur d'un consommable
     *
     * @param rarity est la rareté de l'item
     */
    public Drink(Rarity rarity, DrinkType type, ItemMeta meta) {
        super(rarity, ConsumeType.DRINK,meta);
        this.type = type;
        this.MAXSTACK = type.getMaxStack();
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
