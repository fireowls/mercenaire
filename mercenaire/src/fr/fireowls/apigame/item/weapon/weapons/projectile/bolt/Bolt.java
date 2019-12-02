package fr.fireowls.apigame.item.weapon.weapons.projectile.bolt;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.weapon.weapons.projectile.Projectile;
import fr.fireowls.apigame.item.weapon.weapons.projectile.ProjectileType;

public class Bolt extends Projectile {

    protected BoltType type;

    /**
     * Constructeur d'arme
     *
     * @param rarity est la raretée de l'arme
     * @param type   est le type de l'arme
     * @param damage est les dégâts causé par l'arme
     */
    public Bolt(Rarity rarity, BoltType type, double damage, ItemMeta meta) {
        super(rarity, ProjectileType.BOLT, damage,meta);
        this.type = type;
    }
}
