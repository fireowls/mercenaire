package fr.fireowls.apigame.item.equipment.jewlery.necklace;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.jewlery.Jewlery;
import fr.fireowls.apigame.item.equipment.jewlery.JewleryType;

public class Necklace extends Jewlery {

    protected NecklaceType type;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Necklace(Rarity rarity, NecklaceType type, ItemMeta meta) {
        super(JewleryType.NECKLACE, rarity,meta);
        this.type = type;
    }
}
