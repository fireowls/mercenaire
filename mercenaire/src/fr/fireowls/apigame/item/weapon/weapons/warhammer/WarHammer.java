package fr.fireowls.apigame.item.weapon.weapons.warhammer;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.weapon.Weapon;
import fr.fireowls.apigame.item.weapon.WeaponType;

public abstract class WarHammer extends Weapon {

    protected WarHammerType type;

    /**
     * Constructeur d'arme
     *
     * @param rarity est la raretée de l'arme
     * @param type   est le type de l'arme
     * @param damage est les dégâts causé par l'arme
     */
    public WarHammer(Rarity rarity, WarHammerType type, double damage, ItemMeta meta) {
        super(rarity, WeaponType.WARHAMMER, damage,meta);
        this.type = type;
    }
}
