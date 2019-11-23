package fr.fireowls.apigame.item.weapon.weap;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Une épée en pierre basique
 */
public class StoneSword extends Weapon implements Craftable, Sellable {
    /**
     * Constructeur de l'épée en pierre
     */
    public StoneSword() {
        super(Rarity.COMMON, WeaponType.STONESWORD,1);
    }

    /**
     * Fabrique un épée si le joueur possède les materiaux necessaire
     */
    @Override
    public void craft() {

    }

    /**
     * @return false si les materiaux nécassiares ne sont pas dans l'inventaire du joueur, sinon true
     */
    @Override
    public boolean hasMaterial() {
        return false;
    }

    /**
     * Permet de vendre l'épée en pierre
     */
    @Override
    public void sell() {

    }

    /**
     * @return la valeur de l'épée en pierre
     */
    @Override
    public double getPrice() {
        return 10;
    }
}
