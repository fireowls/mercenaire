package fr.fireowls.apigame.item;

import fr.fireowls.apigame.item.weapon.weap.StoneSword;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Classe de base de tout les items du jeu
 */
public class Item {
    private ItemType type;
    private Rarity rarity;

    /**
     * Constructeur d'item
     * @param type est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Item(ItemType type,Rarity rarity){
        this.type = type;
        this.rarity = rarity;
    }
}
