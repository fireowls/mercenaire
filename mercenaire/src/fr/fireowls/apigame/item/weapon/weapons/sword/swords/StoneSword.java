package fr.fireowls.apigame.item.weapon.weapons.sword.swords;

import fr.fireowls.apigame.item.Craftable;
import fr.fireowls.apigame.item.ItemMeta;
import fr.fireowls.apigame.item.Rarity;
import fr.fireowls.apigame.item.Sellable;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;
import fr.fireowls.apigame.item.weapon.weapons.sword.Sword;
import fr.fireowls.apigame.item.weapon.weapons.sword.SwordType;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Une épée en pierre basique
 */
public class StoneSword extends Sword implements Craftable, Sellable {
    /**
     * Constructeur de l'épée en pierre
     */
    public StoneSword() {
        super(Rarity.COMMON, SwordType.STONESWORD,1,new ItemMeta("stoneSword.json"));
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
        return 5;
    }
}
