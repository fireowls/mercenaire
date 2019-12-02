package fr.fireowls.apigame.item.weapon.weapons.projectile.arrow;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.weapon.weapons.projectile.Projectile;
import fr.fireowls.apigame.item.weapon.weapons.projectile.ProjectileType;

public class Arrow extends Projectile {

    protected ArrowType type;

    /**
     * Constructeur d'arme
     *
     * @param rarity est la raretée de l'arme
     * @param type   est le type de l'arme
     * @param damage est les dégâts causé par l'arme
     */
    public Arrow(Rarity rarity,ArrowType type, double damage, ItemMeta meta) {
        super(rarity, ProjectileType.ARROW, damage,meta);
        this.type = type;
    }
}
