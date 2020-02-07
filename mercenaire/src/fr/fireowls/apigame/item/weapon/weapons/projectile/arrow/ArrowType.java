package fr.fireowls.apigame.item.weapon.weapons.projectile.arrow;

import fr.fireowls.apigame.item.weapon.weapons.projectile.arrow.arrows.StoneArrow;

public enum ArrowType {
    STONEARROW(StoneArrow.class);

    private Class<? extends Arrow> c;

    private ArrowType(Class<? extends Arrow> c) {this.c = c;}


    public Class<? extends Arrow> getArrowClass() {
        return c;
    }
}
