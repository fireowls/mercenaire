package fr.fireowls.apigame.item.weapon.weapons.projectile;

import fr.fireowls.apigame.item.weapon.weapons.projectile.arrow.Arrow;
import fr.fireowls.apigame.item.weapon.weapons.projectile.bolt.Bolt;

public enum ProjectileType {
    ARROW(Arrow.class),
    BOLT(Bolt.class);

    private Class<? extends Projectile> c;

    private ProjectileType(Class<? extends Projectile> c) {this.c = c;}


    public Class<? extends Projectile> getProjectileClass() {
        return c;
    }
}

