package fr.fireowls.apigame.item.weapon;

import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.ItemType;
import fr.fireowls.apigame.item.attribut.Rarity;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Classe de base de tout les armes du jeu
 */
public abstract class Weapon extends Item {
    /**
     * Dégâts de l'arme
     */
    protected double damage;
    /**
     * Type de l'arme
     */
    protected WeaponType type;

    /**
     * Constructeur d'arme
     * @param rarity est la raretée de l'arme
     * @param type est le type de l'arme
     * @param damage est les dégâts causé par l'arme
     */
    public Weapon(Rarity rarity,WeaponType type,double damage, ItemMeta meta) {
        super(ItemType.WEAPON, rarity,meta);
        this.type = type;
        this.damage = damage;
    }

    /**
     * @return les dégâts de l'arme
     */
    public double getDamage(){
        return damage;
    }

    /**
     * Peut changer la valeur de dégât de l'arme
     * @param damage est la nouvelle valeur de dégât
     */
    public void setDamage(double damage){
        this.damage = damage;
    }
}
