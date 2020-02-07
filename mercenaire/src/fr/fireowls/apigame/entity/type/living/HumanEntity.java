package fr.fireowls.apigame.entity.type.living;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.ChunkLoader;
import fr.fireowls.apigame.entity.type.EntityType;
import fr.fireowls.apigame.utils.textures.SpriteSheet;
import fr.fireowls.apigame.world.chunk.ChunkPosition;

public class HumanEntity extends LivingEntity implements ChunkLoader {

    SpriteSheet spriteSheet;

    public HumanEntity() {
        super(EntityType.HUMAN, DEFAULT_MAX_HEALTH, DEFAULT_MAX_SPEED, DEFAULT_ACCELERATION, DEFAULT_DECELERATION);
    }

    @Override
    protected void onCreate() {
        spriteSheet = new SpriteSheet("textures/entities/human");
    }

    @Override
    protected void onUpdate(float delta) {
        spriteSheet.update(delta);
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        batch.draw(spriteSheet.getTexture(), location.getDrawingX(), location.getDrawingY(), spriteSheet.getWidth(), spriteSheet.getHeight());
    }

    @Override
    protected void onPause() {

    }

    @Override
    protected void onResume() {

    }

    @Override
    protected void onDispose() {
        spriteSheet.dispose();
    }

    @Override
    public ChunkPosition getChunkPosition() {
        return location.getChunkPosition();
    }
}
