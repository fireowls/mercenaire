package fr.fireowls.apigame.item.weapon.weapons.projectile.bolt;

import fr.fireowls.apigame.item.Rarity;
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
    public Bolt(Rarity rarity, BoltType type, double damage) {
        super(rarity, ProjectileType.BOLT, damage);
        this.type = type;
    }
}
