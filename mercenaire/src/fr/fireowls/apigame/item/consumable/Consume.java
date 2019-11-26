package fr.fireowls.apigame.item.consumable;

import fr.fireowls.apigame.item.*;

import java.lang.reflect.InvocationTargetException;

public class Consume extends Item implements Consumable {

    protected ConsumeType type;

    /**
     * Constructeur d'un consommable
     * @param rarity est la rareté de l'item
     */
    public Consume(Rarity rarity, ConsumeType type, ItemMeta meta) {
        super(ItemType.CONSUMABLE, rarity,meta);
        this.type = type;
    }

    @Override
    public void consume() {
        try {
            type.getConsClass().getConstructor().newInstance().consume();
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
