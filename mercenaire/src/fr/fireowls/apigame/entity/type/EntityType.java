package fr.fireowls.apigame.entity.type;

import fr.fireowls.apigame.entity.Entity;
import fr.fireowls.apigame.entity.type.living.ChickenEntity;
import fr.fireowls.apigame.entity.type.living.HumanEntity;

public enum EntityType {

    HUMAN(HumanEntity.class),
    CHICKEN(ChickenEntity.class);

    private Class<? extends Entity> c;

    private EntityType(Class<? extends Entity> c) {
        this.c = c;
    }

    public Class<? extends Entity> getEntityClass() {
        return c;
    }

}
