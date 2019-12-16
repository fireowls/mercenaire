package fr.fireowls.apigame.entity.type;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.entity.ChunkLoader;
import fr.fireowls.apigame.entity.Entity;
import fr.fireowls.apigame.entity.EntityMeta;
import fr.fireowls.apigame.entity.shape.EntityShape;
import fr.fireowls.apigame.utils.textures.SpriteSheet;
import fr.fireowls.apigame.world.chunk.ChunkPosition;

public class Player extends Entity implements ChunkLoader {


    public Player(EntityShape shape, EntityMeta meta) {
        super(EntityType.PLAYER, shape, meta);
    }

    @Override
    protected void onCreate() {
        meta.setSpriteSheet(new SpriteSheet("textures/entities/human"));
    }

    @Override
    protected void onUpdate(float delta) {

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

    @Override
    public ChunkPosition getChunkPosition() {
        return location != null ? location.getChunkPosition() : null;
    }

}
