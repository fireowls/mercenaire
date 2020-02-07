package fr.fireowls.apigame.entity;

import fr.fireowls.apigame.utils.textures.SpriteSheet;

public class EntityMeta {

    private String name;
    private SpriteSheet spriteSheet;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpriteSheet(SpriteSheet spriteSheet) {
        this.spriteSheet = spriteSheet;
    }

    public SpriteSheet getSpriteSheet() {
        return spriteSheet;
    }

}
