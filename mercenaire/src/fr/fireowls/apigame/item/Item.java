package fr.fireowls.apigame.item;

import fr.fireowls.apigame.item.equipment.armor.belt.belts.IronBelt;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Classe de base de tout les items du jeu
 */
public class Item {
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

    public String toString(){
        return this.getClass().getSimpleName()+"[rarity : "+rarity.toString()+"]";
    }
}
