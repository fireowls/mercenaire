package fr.fireowls.apigame.item.material;

import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.ItemType;
import fr.fireowls.apigame.item.attribut.Rarity;

public abstract class Material extends Item {

    protected final int MAX_STACK;
    protected MaterialType type;

    public Material(Rarity rarity,MaterialType type, ItemMeta meta) {
        super(ItemType.MATERIAL, rarity,meta);
        this.type = type;
        this.MAX_STACK = type.getMaxStack();
    }

}
