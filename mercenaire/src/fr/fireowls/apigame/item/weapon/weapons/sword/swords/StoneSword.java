package fr.fireowls.apigame.item.weapon.weapons.sword.swords;

import fr.fireowls.apigame.craft.workbench.WorkbenchRecipe;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.attribut.Craftable;
import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.attribut.Sellable;
import fr.fireowls.apigame.item.utils.HasMaterial;
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
    public boolean hasMaterial(Inventory inv,int nb) {
        return HasMaterial.hasMat(WorkbenchRecipe.getItemRecipe(this.getClass()),inv,nb);
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
    public int getPrice() {
        return 20;
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
