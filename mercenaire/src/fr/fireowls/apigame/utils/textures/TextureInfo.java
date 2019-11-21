package fr.fireowls.apigame.utils.textures;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

class TextureInfo {

    private Texture texture;
    private TextureRegion[][] frames;
    private Animation<TextureRegion> animation;

    private double frequency;

    TextureInfo(Texture texture, TextureRegion[][] frames) {
        this.texture = texture;
        this.frames = frames;
    }

    TextureInfo(Texture texture, TextureRegion[][] frames, double frequency) {
        this.texture = texture;
        this.frames = frames;
        this.frequency = frequency;
    }

    TextureInfo(Texture texture, TextureRegion[][] frames, Animation<TextureRegion> animation, double frequency) {
        this.texture = texture;
        this.animation = animation;
        this.frames = frames;
        this.frequency = frequency;
    }

    void setAnimation(Animation<TextureRegion> animation) {
        this.animation = animation;
    }

    void setTexture(Texture texture) {
        this.texture = texture;
    }

    Texture getTexture() {
        return texture;
    }

    Animation<TextureRegion> getAnimation() {
        return animation;
    }

    TextureRegion[] getFrames() {
        TextureRegion[] tmp = new TextureRegion[frames[0].length * frames.length];
        int index = 0;
        for (int row = 0 ; row < frames.length ; row++)
            for (int col = 0 ; col < frames[0].length ; col++)
                tmp[index++] = frames[row][col];

        return tmp;
    }

    double getFrequency() {
        return frequency;
    }
}
