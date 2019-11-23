package fr.fireowls.apigame.item.weapon;

import fr.fireowls.apigame.item.weapon.weap.*;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Liste de tout les armes du jeu
 */
public enum WeaponType {
    /**
     * Epée en pierre
     */
    STONESWORD(StoneSword.class),
    /**
     * Patte de tigre à dent de sapin
     */
    TIGRE_PAW(TigrePaw.class);

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
