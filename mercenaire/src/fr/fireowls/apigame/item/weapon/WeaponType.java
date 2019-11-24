package fr.fireowls.apigame.item.weapon;

import fr.fireowls.apigame.item.weapon.weapons.*;
import fr.fireowls.apigame.item.weapon.weapons.projectile.Projectile;
import fr.fireowls.apigame.item.weapon.weapons.sword.Sword;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Liste de tout les armes du jeu
 */
public enum WeaponType {
    /**
     * Epée
     */
    SWORD(Sword.class),
    /**
     * Projectile
     */
    PROJECTILE(Projectile.class),
    /**
     * Patte de tigre à dent de sapin
     */
    TIGERPAW(TigerPaw.class);

    private Class<? extends Weapon> c;

    private WeaponType(Class<? extends Weapon> c){
        this.c = c;
    }

    /**
     * @return la classe de l'arme
     */
    public Class<? extends Weapon> getWeapClass(){
        return c;
    }
}
