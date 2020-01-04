package fr.fireowls.apigame.item;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.ItemType;
import fr.fireowls.apigame.item.attribut.Rarity;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Classe de base de tout les items du jeu
 */
public abstract class Item {
    private ItemType type;
    private Rarity rarity;
    private ItemMeta meta;

    /**
     * Constructeur d'item
     * @param type est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Item(ItemType type,Rarity rarity,ItemMeta meta){
        this.type = type;
        this.rarity = rarity;
        this.meta = meta;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public ItemType getType() {
        return type;
    }

    public ItemMeta getMeta() { return meta; }

    public String toString(){
        String res = meta.getName()+":\n";
        res+="\t"+meta.getDesc()+"\n";
        res+="\t"+rarity.toString().toLowerCase()+"\n";
        return res;
    }

    public abstract boolean hasMaterial(Inventory inv,int nb);
    public abstract int getMaxStackValue();

}
