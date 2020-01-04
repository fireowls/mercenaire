package fr.fireowls.apigame.item.material;

import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.ItemType;
import fr.fireowls.apigame.item.attribut.Rarity;

public abstract class Material extends Item {

    protected int amount;
    protected final int MAX_STACK;
    protected MaterialType type;

    public Material(Rarity rarity,MaterialType type,int amount, ItemMeta meta) {
        super(ItemType.MATERIAL, rarity,meta);
        this.amount = amount;
        this.type = type;
        this.MAX_STACK = type.getMaxStack();
    }

    public int getAmount(){
        return amount;
    }

    public int placeLeft(){
        return MAX_STACK - amount;
    }
}
