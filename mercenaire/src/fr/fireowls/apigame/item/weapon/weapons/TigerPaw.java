package fr.fireowls.apigame.item.weapon.weapons;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * La légendaire Patte de tigre à dent de sapin
 */
public class TigerPaw extends Weapon implements Sellable {
    /**
     * Constructeur de la Patte de tigre à dent de sapin
     */
    public TigerPaw() {
        super(Rarity.LEGENDARY, WeaponType.TIGERPAW,250,new ItemMeta("tigerPaw.json"));
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
    public int getPrice() {
        return 100000;
    }

    @Override
    public boolean hasMaterial(Inventory inv,int nb) {
        return false;
    }

    @Override
    public int getMaxStackValue() {
        return 1;
    }

    @Override
    public int getMarchandPrice() {
        return 0;
    }
}
