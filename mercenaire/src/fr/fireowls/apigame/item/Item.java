package fr.fireowls.apigame.item;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.ItemType;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.money.Purse;

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

    /**
     * Verify if you can craft a certain item with the material in your inventory.
     * @param inv the inventory of the player
     * @param nb the number of item that you want to craft
     * @return return true if you can craft nb items, else return false.
     */
    public abstract boolean hasMaterial(Inventory inv,int nb);

    /**
     *
     * @return the max value of item of one stack
     */
    public abstract int getMaxStackValue();

    /**
     *
     * @return the price of the item, if the item is not sellable return 0
     */
    public abstract int getPrice();

    /**
     *
     * @return the price of the item, if the item is not buyable return 0
    */
    public abstract int getMarchandPrice();


}
