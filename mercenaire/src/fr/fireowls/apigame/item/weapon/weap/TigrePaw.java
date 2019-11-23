package fr.fireowls.apigame.item.weapon.weap;

import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * La légendaire Patte de tigre à dent de sapin
 */
public class TigrePaw extends Weapon implements Sellable {
    /**
     * Constructeur de la Patte de tigre à dent de sapin
     */
    public TigrePaw() {
        super(Rarity.LEGENDARY, WeaponType.TIGRE_PAW,250);
    }

    /**
     * Permet de vendre la Patte de tigre à dent de sapin
     */
    @Override
    public void sell() {

    }

    /**
     * @return la valeur de la Patte de tigre à dent de sapin
     */
    @Override
    public double getPrice() {
        return 1000000;
    }
}
