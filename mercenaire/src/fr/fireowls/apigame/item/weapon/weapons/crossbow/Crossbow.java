package fr.fireowls.apigame.item.weapon.weapons.crossbow;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;

public abstract class Crossbow extends Weapon {

    protected CrossbowType type;

    /**
     * Constructeur d'arme
     *
     * @param rarity est la raretée de l'arme
     * @param type   est le type de l'arme
     * @param damage est les dégâts causé par l'arme
     */
    public Crossbow(Rarity rarity, CrossbowType type, double damage, ItemMeta meta) {
        super(rarity, WeaponType.CROSSBOW, damage,meta);
        this.type = type;
    }
}
