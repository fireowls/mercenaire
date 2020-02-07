package fr.fireowls.apigame.item.equipment.quiver;

import fr.fireowls.apigame.item.attribut.ItemMeta;
import fr.fireowls.apigame.item.attribut.Rarity;
import fr.fireowls.apigame.item.equipment.Equipment;
import fr.fireowls.apigame.item.equipment.EquipmentType;
import fr.fireowls.apigame.item.weapon.weapons.projectile.Projectile;

public abstract class Quiver extends Equipment {

    protected QuiverType type;
    protected Projectile[] slots;

    /**
     * Constructeur d'item
     *
     * @param type   est le type de l'item (Weapon, Tool, Material, Consumable ou Equipment)
     * @param rarity est la rareté de l'item
     */
    public Quiver(Rarity rarity,QuiverType type,int slot, ItemMeta meta) {
        super(EquipmentType.QUIVER, rarity,meta);
        this.type = type;
        this.slots = new Projectile[slot];
    }

    public boolean addProjectile(Projectile... projectiles){
        if(availableSlot() == 0 || availableSlot()-projectiles.length < 0) return false;
        else {
            for(int j = 0; j < projectiles.length; j++){
                boolean done = false;
                for(int i = 0; i < this.slots.length && !done; i++){
                    if(this.slots[i] == null){
                        this.slots[i] = projectiles[j];
                        done = true;
                    }
                }
            }
        }
        return true;
    }

    public int availableSlot(){
        int slot = 0;
        for(int i = 0 ; i < this.slots.length; i++){
            if(this.slots[i] == null) slot++;
        }
        return slot;
    }
}
