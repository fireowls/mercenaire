package fr.fireowls.apigame.item.weapon.weapons.projectile;

import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;

public class Projectile extends Weapon {

    protected ProjectileType type;

    /**
     * Constructeur d'arme
     *
     * @param rarity est la raretée de l'arme
     * @param type   est le type de l'arme
     * @param damage est les dégâts causé par l'arme
     */
    public Projectile(Rarity rarity, ProjectileType type, double damage, ItemMeta meta) {
        super(rarity, WeaponType.PROJECTILE, damage,meta);
        this.type = type;
    }
}
