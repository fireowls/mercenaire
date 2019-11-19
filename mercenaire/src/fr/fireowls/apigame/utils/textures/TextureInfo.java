package fr.fireowls.apigame.utils.textures;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.utils.JsonValue;

import java.io.File;
import java.nio.file.Paths;

class TextureInfo {

    private File file;
    private double frequency;
    private Texture texture = null;
    private boolean animation = false;

    private float animationDelay;
    private int firstFrame, lastFrame;
    private Animation.PlayMode playMode;

    TextureInfo(JsonValue value, File infoFile) {
        String fileValue = value.getString("file");
        file = Paths.get(fileValue).isAbsolute() ?
                new File(fileValue) :
                new File(infoFile.getParentFile().getAbsoluteFile() + "/" + fileValue);
        frequency = value.getDouble("frequency");

        JsonValue animation = value.get("animation");
        if (animation != null) {
            this.animation = true;

            animationDelay = animation.getFloat("delay");
            firstFrame = animation.getInt("first-frame");
            lastFrame = animation.getInt("last-frame");
            playMode = Animation.PlayMode.valueOf(animation.getString("play-mode"));
        }

    }

    File getFile() {
        return file;
    }

    double getFrequency() {
        return frequency;
    }

    Texture getTexture() {
        return texture == null ? texture = new Texture(Gdx.files.internal(file.getAbsolutePath())) : texture;
    }

    boolean haveAnimation() {
        return animation;
    }

    public float getAnimationDelay() {
        return animationDelay;
    }

    public int getFirstFrame() {
        return firstFrame;
    }

    public int getLastFrame() {
        return lastFrame;
    }

    public Animation.PlayMode getPlayMode() {
        return playMode;
    }
}
