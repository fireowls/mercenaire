package fr.fireowls.apigame.entity.type.living;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.type.EntityType;

public class ChickenEntity extends LivingEntity {

    public ChickenEntity() {
        super(EntityType.CHICKEN, DEFAULT_MAX_HEALTH, DEFAULT_MAX_SPEED, DEFAULT_ACCELERATION, DEFAULT_DECELERATION);
    }

    @Override
    protected void onCreate() {

    }

    @Override
    protected void onUpdate(float delta) {

    }

    @Override
    protected void onDraw(SpriteBatch batch) {

    }

    @Override
    protected void onPause() {

    }

    @Override
    protected void onResume() {

    }

    @Override
    protected void onDispose() {

    }
}
