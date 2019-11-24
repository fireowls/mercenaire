package fr.fireowls.apigame.item.weapon.weapons.projectile.bolt;

import fr.fireowls.apigame.item.weapon.weapons.projectile.bolt.bolts.StoneBolt;

public enum BoltType {
    STONEBOLT(StoneBolt.class);

    private Class<? extends Bolt> c;

    private BoltType(Class<? extends Bolt> c){this.c = c;}

    public Class<? extends Bolt> getBoltClass() {
        return c;
    }
}
